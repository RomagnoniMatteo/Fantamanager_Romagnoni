package com.matteoromagnoni.fantamanager.formazione;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.os.Handler;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.CenterCrop;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.matteoromagnoni.fantamanager.ModelDataRecycler.AddPlayerAdapter;
import com.matteoromagnoni.fantamanager.ModelDataRecycler.AddPlayerItem;
import com.matteoromagnoni.fantamanager.ModelDataRecycler.FormazioneAdapter;
import com.matteoromagnoni.fantamanager.ModelDataRecycler.FormazioneItem;
import com.matteoromagnoni.fantamanager.R;

import java.util.ArrayList;
import java.util.List;

public class Formazione extends AppCompatActivity {

    List<FormazioneItem> playerList;
    LinearLayoutCompat llContainer;

    AppCompatTextView txtClub;
    AppCompatTextView txtCoach;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formazione);

        llContainer = findViewById(R.id.llContainer);
        txtClub = findViewById(R.id.txtClub);
        txtCoach = findViewById(R.id.txtCoach);

        playerList = createPlayerList();

        createFirstEleven(new FirstEleven("Galatasaray", "Fatih Terim", "4-1-4-1", playerList));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.formation_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        cleanContainer();
        createFirstEleven(new FirstEleven("Galatasaray", "Fatih Terim", item.getTitle().toString(), playerList));
        return true;
    }


    /**
     * creates sample data
     * <p>
     * starts from the goalkeeper, lining up towards the strikers.
     * works from right to left for each position.
     * To make the placement on the screen properly, you must set the player list according to the above.
     *
     * @return
     */
    private List<FormazioneItem> createPlayerList()
    {
        List<FormazioneItem> playerList = new ArrayList<>();

        playerList.add(new FormazioneItem(47, R.drawable.blucarina, "Badelj"));
        playerList.add(new FormazioneItem(47, R.drawable.blucarina, "Badelj"));
        playerList.add(new FormazioneItem(47, R.drawable.blucarina, "Badelj"));
        playerList.add(new FormazioneItem(47, R.drawable.blucarina, "Badelj"));
        playerList.add(new FormazioneItem(47, R.drawable.blucarina, "Badelj"));
        playerList.add(new FormazioneItem(47, R.drawable.blucarina, "Badelj"));
        playerList.add(new FormazioneItem(47, R.drawable.blucarina, "Badelj"));
        playerList.add(new FormazioneItem(47, R.drawable.blucarina, "Badelj"));
        playerList.add(new FormazioneItem(47, R.drawable.blucarina, "Badelj"));
        playerList.add(new FormazioneItem(47, R.drawable.blucarina, "Badelj"));
        playerList.add(new FormazioneItem(47, R.drawable.blucarina, "Badelj"));

        return playerList;
    }

    /**
     * creates first eleven
     *
     * @param firstEleven
     */
    private void createFirstEleven(FirstEleven firstEleven)
    {
        setClub(firstEleven.club, firstEleven.formation);
        setCoach(firstEleven.coach);

        addPositions(firstEleven.formation);
        addPlayers(firstEleven);
    }

    /**
     * adds the positions to the field
     * each position means a LinearLayout
     * <p>
     * for 4-1-4-1, adds 5 positions from goalkeeper to striker
     */
    private void addPositions(String formation)
    {
        //adds one more position
        //just wanna make it like that
        //you can change it
        for (int i = 0; i <= getPositionCount(formation); i++)
        {
            LinearLayoutCompat layoutPosition = new LinearLayoutCompat(this);

            LinearLayoutCompat.LayoutParams layoutParams = new LinearLayoutCompat.LayoutParams(LinearLayoutCompat.LayoutParams.MATCH_PARENT, 0);
            layoutParams.weight = 1;
            layoutPosition.setLayoutParams(layoutParams);
            layoutPosition.setGravity(Gravity.CENTER);
            layoutPosition.setOrientation(LinearLayoutCompat.HORIZONTAL);

            layoutPosition.setId(i);

            llContainer.addView(layoutPosition);
        }
    }

    /**
     * adds players to the field.
     *
     * @param firstEleven
     */
    private void addPlayers(FirstEleven firstEleven)
    {
        int[] formationArray = getFormationArray(firstEleven.formation.split("-"));

        //starting index
        //end index
        // for ex : 4-1-4-1 means 4 defenders so defender position has 4 players
        // start = 0 was goalkeeper.
        // start = 1 is the first defender index in player list.
        // end = 5 is the last defender index in player list
        int start = 0;
        int end = 0;

        for (int i = 0; i < formationArray.length; i++)
        {
            start = end;
            end += formationArray[i];

            final LinearLayoutCompat positionLayout = llContainer.findViewById(i);

            for (int j = start; j < end; j++)
            {
                //adds player container layout to the position layout.
                final LinearLayoutCompat playerContainerLayout = getPlayerContainerLayout(i);
                positionLayout.addView(playerContainerLayout);

                final LinearLayoutCompat playerLayout = getPlayerLayout(firstEleven.playerList.get(j));


              playerContainerLayout.addView(playerLayout);

            }
        }
    }

    private LinearLayoutCompat getPlayerContainerLayout(int index)
    {
        LinearLayoutCompat playerContainerLayout = new LinearLayoutCompat(this);
        LinearLayoutCompat.LayoutParams layoutParams = new LinearLayoutCompat.LayoutParams(0, LinearLayoutCompat.LayoutParams.MATCH_PARENT);
        layoutParams.weight = 1;
        playerContainerLayout.setLayoutParams(layoutParams);
        playerContainerLayout.setGravity(Gravity.CENTER);

        playerContainerLayout.setId(index);

        return playerContainerLayout;
    }

    private LinearLayoutCompat getPlayerLayout(FormazioneItem player)
    {
        LayoutInflater inflater = LayoutInflater.from(this);
        LinearLayoutCompat layout = (LinearLayoutCompat) inflater.inflate(R.layout.formitem, null, false);

        setPlayer(layout, player);

        return layout;
    }

    /**
     * sets player's data
     *
     * @param layout
     * @param player
     */
    private void setPlayer(LinearLayoutCompat layout, FormazioneItem player)
    {
        AppCompatImageView imgProfilePicture = layout.findViewById(R.id.divisaform);

        imgProfilePicture.setImageResource(player.getDivisa());
        AppCompatTextView txtName = layout.findViewById(R.id.nomeformazione);
        txtName.setText(player.getNome());
        AppCompatTextView txtNumber = layout.findViewById(R.id.numfor);
        txtNumber.setText(String.valueOf(player.getNmaglia()));
    }

    private void setCoach(String coach)
    {
        txtCoach.setText(coach);
    }

    private void setClub(String club, String formation)
    {
        txtClub.setText(club + " (" + formation + ")");
    }

    private int getPositionCount(String formation)
    {
        int[] formationArray = getFormationArray(formation.split("-"));
        return formationArray.length;
    }

    /**
     * gets formation array as int array
     * first element of the array is the goalkeeper.
     *
     * @param stringArray : formation as string array
     * @return
     */
    private int[] getFormationArray(String[] stringArray)
    {
        int[] numberArray = new int[stringArray.length + 1];
        numberArray[0] = 1; // here is the goalkeeper.

        // adds the numbers from formation (for ex : 4-1-4-1)
        for (int i = 1; i < numberArray.length; i++)
        {
            numberArray[i] = Integer.parseInt(stringArray[i - 1]);
        }

        return numberArray;
    }

    private void cleanContainer()
    {
        llContainer.removeAllViews();
    }
}

/*
        //difesa formazione
        AddPlayerItem[] mydif = new AddPlayerItem[] {
                new AddPlayerItem( R.drawable.ic_baseline_add_circle_24),
                new AddPlayerItem( R.drawable.ic_baseline_add_circle_24),
                new AddPlayerItem( R.drawable.ic_baseline_add_circle_24),

        };

        RecyclerView recattosp = (RecyclerView) findViewById(R.id.difesaform);
        AddPlayerAdapter aptattosp = new AddPlayerAdapter(mydif);
        recattosp.setHasFixedSize(true);
        LinearLayoutManager layoutManagerdif = (new LinearLayoutManager(this,RecyclerView.HORIZONTAL, false));
        recattosp.setLayoutManager(layoutManagerdif);
        recattosp.setAdapter(aptattosp);


        //centro formazione
        AddPlayerItem[] mycc = new AddPlayerItem[] {
                new AddPlayerItem( R.drawable.ic_baseline_add_circle_24),
                new AddPlayerItem( R.drawable.ic_baseline_add_circle_24),
                new AddPlayerItem( R.drawable.ic_baseline_add_circle_24),
                new AddPlayerItem( R.drawable.ic_baseline_add_circle_24),

        };

        RecyclerView recc = (RecyclerView) findViewById(R.id.centroform);
        AddPlayerAdapter aptcc = new AddPlayerAdapter(mycc);
        recc.setHasFixedSize(true);
        LinearLayoutManager layoutManagerattosp = (new LinearLayoutManager(this,RecyclerView.HORIZONTAL, false));
        recc.setLayoutManager(layoutManagerattosp);
        recc.setAdapter(aptcc);

        //att formazione
        AddPlayerItem[] myatt = new AddPlayerItem[] {
                new AddPlayerItem( R.drawable.ic_baseline_add_circle_24),
                new AddPlayerItem( R.drawable.ic_baseline_add_circle_24),
                new AddPlayerItem( R.drawable.ic_baseline_add_circle_24),

        };

        RecyclerView recatt = (RecyclerView) findViewById(R.id.attform);
        AddPlayerAdapter aptatt = new AddPlayerAdapter(myatt);
        recatt.setHasFixedSize(true);
        LinearLayoutManager layoutManageratt = (new LinearLayoutManager(this,RecyclerView.HORIZONTAL, false));
        recatt.setLayoutManager(layoutManageratt);
        recatt.setAdapter(aptatt);


        //bench formazione
        AddPlayerItem[] mybench = new AddPlayerItem[] {
                new AddPlayerItem( R.drawable.ic_baseline_add_circle_24),
                new AddPlayerItem( R.drawable.ic_baseline_add_circle_24),
                new AddPlayerItem( R.drawable.ic_baseline_add_circle_24),
                new AddPlayerItem( R.drawable.ic_baseline_add_circle_24),
                new AddPlayerItem( R.drawable.ic_baseline_add_circle_24),
                new AddPlayerItem( R.drawable.ic_baseline_add_circle_24),

        };

        RecyclerView recbench = (RecyclerView) findViewById(R.id.benchform);
        AddPlayerAdapter aptbnch = new AddPlayerAdapter(mybench);
        recbench.setHasFixedSize(true);
        LinearLayoutManager layoutManagerbnch = (new LinearLayoutManager(this,RecyclerView.HORIZONTAL, false));
        recbench.setLayoutManager(layoutManagerbnch);
        recbench.setAdapter(aptbnch);

        //bench2 formazione
        AddPlayerItem[] mybench2 = new AddPlayerItem[] {
                new AddPlayerItem( R.drawable.ic_baseline_add_circle_24),
                new AddPlayerItem( R.drawable.ic_baseline_add_circle_24),
                new AddPlayerItem( R.drawable.ic_baseline_add_circle_24),
                new AddPlayerItem( R.drawable.ic_baseline_add_circle_24),
                new AddPlayerItem( R.drawable.ic_baseline_add_circle_24),
                new AddPlayerItem( R.drawable.ic_baseline_add_circle_24),

        };

        RecyclerView recbench2 = (RecyclerView) findViewById(R.id.bench2form);
        AddPlayerAdapter aptbnch2 = new AddPlayerAdapter(mybench2);
        recbench2.setHasFixedSize(true);
        LinearLayoutManager layoutManagerbnch2 = (new LinearLayoutManager(this,RecyclerView.HORIZONTAL, false));
        recbench2.setLayoutManager(layoutManagerbnch2);
        recbench2.setAdapter(aptbnch2);


*/
