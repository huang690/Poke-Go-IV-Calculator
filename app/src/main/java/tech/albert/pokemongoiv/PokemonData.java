package tech.albert.pokemongoiv;

import android.util.Log;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by albret on 8/10/2016.
 */
public class PokemonData {
	double cp_multiplier_value[] = {0.0940000, 0.1351374, 0.1663979, 0.1926509, 0.2157325, 0.2365727, 0.2557201, 0.2735304, 0.2902499, 0.3060574, 0.3210876, 0.3354450, 0.3492127, 0.3624578, 0.3752356, 0.3875924, 0.3995673, 0.4111936, 0.4225000, 0.4335117, 0.4431076, 0.4530600, 0.4627984, 0.4723361, 0.4816850, 0.4908558, 0.4998584, 0.5087018, 0.5173940, 0.5259425, 0.5343543, 0.5426358, 0.5507927, 0.5588306, 0.5667545, 0.5745692, 0.5822789, 0.5898879, 0.5974000, 0.6048188, 0.6121573, 0.6194041, 0.6265671, 0.6336492, 0.6406530, 0.6475810, 0.6544356, 0.6612193, 0.6679340, 0.6745819, 0.6811649, 0.6876849, 0.6941437, 0.7005429, 0.7068842, 0.7131691, 0.7193991, 0.7255756, 0.7317000, 0.7377735, 0.7377695, 0.7407856, 0.7437894, 0.7467812, 0.7497610, 0.7527291, 0.7556855, 0.7586304, 0.7615638, 0.7644861, 0.7673972, 0.7702973, 0.7731865, 0.7760650, 0.7789328, 0.7817901, 0.7846370, 0.7874736, 0.7903000, 0.7931164};
	int level_stardust_amount[] = {200, 400, 600, 800, 1000, 1300, 1600, 1900, 2200, 2500, 3000, 3500, 4000, 4500, 5000, 6000, 7000, 8000, 9000, 10000};
	int level_stardust_level[] = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31, 33, 35, 37, 39};
	String pokemon_names[] = {"Bulbasaur", "Ivysaur", "Venusaur", "Charmander", "Charmeleon", "Charizard", "Squirtle", "Wartortle", "Blastoise", "Caterpie", "Metapod", "Butterfree", "Weedle", "Kakuna", "Beedrill", "Pidgey", "Pidgeotto", "Pidgeot", "Rattata", "Raticate", "Spearow", "Fearow", "Ekans", "Arbok", "Pikachu", "Raichu", "Sandshrew", "Sandslash", "Nidoran♀", "Nidorina", "Nidoqueen", "Nidoran♂", "Nidorino", "Nidoking", "Clefairy", "Clefable", "Vulpix", "Ninetales", "Jigglypuff", "Wigglytuff", "Zubat", "Golbat", "Oddish", "Gloom", "Vileplume", "Paras", "Parasect", "Venonat", "Venomoth", "Diglett", "Dugtrio", "Meowth", "Persian", "Psyduck", "Golduck", "Mankey", "Primeape", "Growlithe", "Arcanine", "Poliwag", "Poliwhirl", "Poliwrath", "Abra", "Kadabra", "Alakazam", "Machop", "Machoke", "Machamp", "Bellsprout", "Weepinbell", "Victreebel", "Tentacool", "Tentacruel", "Geodude", "Graveler", "Golem", "Ponyta", "Rapidash", "Slowpoke", "Slowbro", "Magnemite", "Magneton", "Farfetch'd", "Doduo", "Dodrio", "Seel", "Dewgong", "Grimer", "Muk", "Shellder", "Cloyster", "Gastly", "Haunter", "Gengar", "Onix", "Drowzee", "Hypno", "Krabby", "Kingler", "Voltorb", "Electrode", "Exeggcute", "Exeggutor", "Cubone", "Marowak", "Hitmonlee", "Hitmonchan", "Lickitung", "Koffing", "Weezing", "Rhyhorn", "Rhydon", "Chansey", "Tangela", "Kangaskhan", "Horsea", "Seadra", "Goldeen", "Seaking", "Staryu", "Starmie", "Mr. Mime", "Scyther", "Jynx", "Electabuzz", "Magmar", "Pinsir", "Tauros", "Magikarp", "Gyarados", "Lapras", "Ditto", "Eevee", "Vaporeon", "Jolteon", "Flareon", "Porygon", "Omanyte", "Omastar", "Kabuto", "Kabutops", "Aerodactyl", "Snorlax", "Articuno", "Zapdos", "Moltres", "Dratini", "Dragonair", "Dragonite", "Mewtwo", "Mew"};
	int pokemon_attack[] = {126, 156, 198, 128, 160, 212, 112, 144, 186, 62, 56, 144, 68, 62, 144, 94, 126, 170, 92, 146, 102, 168, 112, 166, 124, 200, 90, 150, 100, 132, 184, 110, 142, 204, 116, 178, 106, 176, 98, 168, 88, 164, 134, 162, 202, 122, 162, 108, 172, 108, 148, 104, 156, 132, 194, 122, 178, 156, 230, 108, 132, 180, 110, 150, 186, 118, 154, 198, 158, 190, 222, 106, 170, 106, 142, 176, 168, 200, 110, 184, 128, 186, 138, 126, 182, 104, 156, 124, 180, 120, 196, 136, 172, 204, 90, 104, 162, 116, 178, 102, 150, 110, 232, 102, 140, 148, 138, 126, 136, 190, 110, 166, 40, 164, 142, 122, 176, 112, 172, 130, 194, 154, 176, 172, 198, 214, 184, 148, 42, 192, 186, 110, 114, 186, 192, 238, 156, 132, 180, 148, 190, 182, 180, 198, 232, 242, 128, 170, 250, 284, 220};
	int pokemon_defense[] = {126, 158, 200, 108, 140, 182, 142, 176, 222, 66, 86, 144, 64, 82, 130, 90, 122, 166, 86, 150, 78, 146, 112, 166, 108, 154, 114, 172, 104, 136, 190, 94, 128, 170, 124, 178, 118, 194, 54, 108, 90, 164, 130, 158, 190, 120, 170, 118, 154, 86, 140, 94, 146, 112, 176, 96, 150, 110, 180, 98, 132, 202, 76, 112, 152, 96, 144, 180, 78, 110, 152, 136, 196, 118, 156, 198, 138, 170, 110, 198, 138, 180, 132, 96, 150, 138, 192, 110, 188, 112, 196, 82, 118, 156, 186, 140, 196, 110, 168, 124, 174, 132, 164, 150, 202, 172, 204, 160, 142, 198, 116, 160, 60, 152, 178, 100, 150, 126, 160, 128, 192, 196, 180, 134, 160, 158, 186, 184, 84, 196, 190, 110, 128, 168, 174, 178, 158, 160, 202, 142, 190, 162, 180, 242, 194, 194, 110, 152, 212, 202, 220};
	int pokemon_stamina[] = {90, 120, 160, 78, 116, 156, 88, 118, 158, 90, 100, 120, 80, 90, 130, 80, 126, 166, 60, 110, 80, 130, 70, 120, 70, 120, 100, 150, 110, 140, 180, 92, 122, 162, 140, 190, 76, 146, 230, 280, 80, 150, 90, 120, 150, 70, 120, 120, 140, 20, 70, 80, 130, 100, 160, 80, 130, 110, 180, 80, 130, 180, 50, 80, 110, 140, 160, 180, 100, 130, 160, 80, 160, 80, 110, 160, 100, 130, 180, 190, 50, 100, 104, 70, 120, 130, 180, 160, 210, 60, 100, 60, 90, 120, 70, 120, 170, 60, 110, 80, 120, 120, 190, 100, 120, 100, 100, 180, 80, 130, 160, 210, 500, 130, 210, 60, 110, 90, 160, 60, 120, 80, 140, 130, 130, 130, 130, 150, 40, 190, 260, 96, 110, 260, 130, 130, 130, 70, 140, 60, 120, 160, 320, 180, 180, 180, 82, 122, 182, 212, 200};
	String pokemon_evolution[] = {"Venusaur", "Venusaur", "", "Charizard", "Charizard", "", "Blastoise", "Blastoise", "", "Butterfree", "Butterfree", "", "Beedrill", "Beedrill", "", "Pidgeot", "Pidgeot", "", "Raticate", "", "Fearow", "", "Arbok", "", "Raichu", "", "Sandslash", "", "Nidoqueen", "Nidoqueen", "", "Nidoking", "Nidoking", "", "Clefable", "", "Ninetales", "", "Wigglytuff", "", "Golbat", "", "Vileplume", "Vileplume", "", "Parasect", "", "Venomoth", "", "Dugtrio", "", "Persian", "", "Golduck", "", "Primeape", "", "Arcanine", "", "Poliwrath", "Poliwrath", "", "Alakazam", "Alakazam", "", "Machamp", "Machamp", "", "Victreebel", "Victreebel", "", "Tentacruel", "", "Graveler", "Golem", "", "Rapidash", "", "Slowbro", "", "Magneton", "", "", "Dodrio", "", "Dewgong", "", "Muk", "", "Cloyster", "", "Haunter", "", "", "", "Hypno", "", "Kingler", "", "Electrode", "", "Exeggutor", "", "Marowak", "", "Hitmonchan", "", "", "Weezing", "", "Rhydon", "", "", "", "", "Seadra", "", "Seaking", "", "Starmie", "", "", "", "", "", "", "", "", "Gyarados", "", "", "", "Vaporeon", "", "", "", "", "Omastar", "", "Kabutops", "", "", "", "", "", "", "Dragonite", "Dragonite", "", "", ""};
	int trainer_level = 40;
	String pokemon_name;
	int cp, hp, power_cost;
	int specie;
	Pokemon pika;

	public PokemonData(String pokemon_name, int cp, int hp, int power_cost, boolean powered) {
		this.pokemon_name = pokemon_name;
		this.cp = cp;
		this.hp = hp;
		this.power_cost = power_cost;
		this.specie = 0;
		for (int x = 0; x < pokemon_names.length; x++)
			if (pokemon_names[x].equals(pokemon_name)) {
				specie = x;
				break;
			}
		pika = new Pokemon(specie, hp, cp, power_cost);
		derive(powered);
	}

	public void refine(int new_cp, int new_hp, int new_power_cost) {
		pika.refine(new_cp, new_hp, new_power_cost);
		derive(true);
	}

	public void derive(boolean powered) {
		double limit = pika.levelMax;
		if (!powered)
			limit = Math.min(limit, trainer_level);

		ArrayList<double[]> valids = new ArrayList<>();
		for (double counter = pika.levelMin; counter <= limit; counter += powered ? 0.5 : 1) {
			ArrayList<double[]> temp = pika.setLevel(counter);
			if (temp != null)
				for (int x = 0; x < temp.size(); x++) {
					double[] cur = {counter, temp.get(x)[0], temp.get(x)[1], temp.get(x)[2]};
					valids.add(temp.get(x));
				}
		}

		if (valids.size() > 0) {
			pika.prevData = valids;
			if (valids.size() == 1) {
				double[] temp = valids.get(0);
				Log.v("qwer", "lv: " + temp[0] + ": " + temp[1] + "/" + temp[2] + "/" + temp[3]);
				return;
			}
			double minPerf = 46, maxPerf = -1;
			ArrayList<String> result = new ArrayList<>();
			for (int x = 0; x < valids.size(); x++) {
				double[] temp = valids.get(x);
				double sum = temp[1] + temp[2] + temp[3];
				minPerf = Math.min(sum, minPerf);
				maxPerf = Math.max(sum, maxPerf);
				result.add("lv: " + temp[0] + ": " + temp[1] + "/" + temp[2] + "/" + temp[3]);
				Log.v("qwer", "lv: " + temp[0] + ": " + temp[1] + "/" + temp[2] + "/" + temp[3]);
			}
			Log.v("qwer", result.size() + " combinations");
			minPerf = Math.round(minPerf / 45 * 1000);
			maxPerf = Math.round(maxPerf / 45 * 1000);
			minPerf /= 10;
			maxPerf /= 10;
			Log.v("qwer", minPerf + "% to " + maxPerf + "%");
		}
	}

	public double getCpMultiplier(double input) {
		return cp_multiplier_value[(int) ((input - 1) * 2)];
	}

	class Pokemon {
		int pokemon_specie;
		int hp, cp, power_cost;
		double level;
		int ATK, DEF, STA;
		double levelMin, levelMax;
		ArrayList<double[]> prevData = new ArrayList<>();

		public Pokemon(int pokemon_specie, int hp, int cp, int power_cost) {
			this.pokemon_specie = pokemon_specie;
			this.hp = hp;
			this.cp = cp;
			this.power_cost = power_cost;

			this.ATK = pokemon_attack[pokemon_specie];
			this.DEF = pokemon_defense[pokemon_specie];
			this.STA = pokemon_stamina[pokemon_specie];

			for (int x = 0; x < level_stardust_amount.length; x++) {
				if (power_cost == level_stardust_amount[x]) {
					levelMin = level_stardust_level[x];
					levelMax = level_stardust_level[x + 1] - 0.5;
					break;
				}
			}
		}

		public void refine(int cp, int hp, int power_cost) {
			this.hp = hp;
			this.cp = cp;
			this.power_cost = power_cost;

			for (int x = 0; x < level_stardust_amount.length; x++) {
				if (power_cost == level_stardust_amount[x]) {
					levelMin = level_stardust_level[x];
					levelMax = level_stardust_level[x + 1] - 0.5;
					break;
				}
			}
		}

		public double getCompositeAtk(double iv) {
			return (ATK + iv) * getCpMultiplier(level);
		}

		public double getCompositeDef(double iv) {
			return (DEF + iv) * getCpMultiplier(level);
		}

		public double getCompositeSta(double iv) {
			return (STA + iv) * getCpMultiplier(level);
		}

		public double getCp(double sta, double atk, double def) {
			return Math.max(10, Math.floor(0.1 * Math.pow(getCompositeSta(sta), 0.5) * getCompositeAtk(atk) * Math.pow(getCompositeDef(def), 0.5)));
		}

		public double getHp(double sta) {
			return Math.max(10, Math.floor(getCompositeSta(sta)));
		}

		public boolean checkPrevData(int attack, int defense, int stamina) {
			if (prevData.size() == 0)
				return true;
			for (int x = 0; x < prevData.size(); x++) {
				double[] cur = prevData.get(x);
				if (level == cur[0] + 0.5 && attack == cur[1] && defense == cur[2] && stamina == cur[3])
					return true;
			}
			return false;
		}

		public ArrayList<double[]> setLevel(double input) {
			level = input;

			double minHp = getHp(0), maxHp = getHp(15);

			if (hp < minHp || hp > maxHp)
				return null;

			ArrayList<Integer> possibleSta = new ArrayList<>();
			for (int x = 0; x < 16; x++)
				if (getHp(x) == hp)
					possibleSta.add(x);
			if (possibleSta.size() == 0)
				return null;

			ArrayList<double[]> possibleCombinations = new ArrayList<>();
			for (int stamina = 0; stamina < possibleSta.size(); stamina++) {
				for (int defense = 0; defense < 16; defense++) {
					for (int attack = 0; attack < 16; attack++) {
						double curCp = getCp(possibleSta.get(stamina), attack, defense);
						if (curCp == cp && checkPrevData(attack, defense, possibleSta.get(stamina)))
							possibleCombinations.add(new double[]{level, possibleSta.get(stamina), attack, defense});
					}
				}
			}
			return possibleCombinations;
		}
	}
}
