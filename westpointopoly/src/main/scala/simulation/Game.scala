package simulation

import scala.sys

class Game {

	val menu = Menu()

	def run() {
		players = List("Adam", "Matt", "Peter", "Lisa", "Andrew")
		while (true) {
			println("[1] Show game area")
			println("[2] Show player order")
			println("[3] Advance order")
			val choice = readInt()
			choice match {
				case 1 => println(menu.showGame)
				case 2 => println(menu.listPlayers)
				case 3 => menu.advanceTurn()
				case _ => sys.exit()
			}
		}
	}

}