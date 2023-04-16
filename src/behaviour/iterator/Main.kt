package behaviour.iterator

import behaviour.iterator.iterators.CookerCandidatesIterator
import behaviour.iterator.iterators.DeveloperCandidatesIterator
import behaviour.iterator.offers.CookerJobOffer
import behaviour.iterator.offers.DeveloperJobOffer
import behaviour.iterator.offers.JobOffer

fun main() {
    val cookerJobOffer = CookerJobOffer(zak, alice, sara, anna)
    val cookersIterator = cookerJobOffer.iterator()

    println("Cookers with preconditions to the job offer:")
    while (cookersIterator.hasNext()) {
        cookersIterator.next()?.name?.let { println(it) }
    }

    print("\n")

    val developerJobOffer = DeveloperJobOffer(zak, alice, sara, anna)
    val developersIterator = developerJobOffer.iterator()

    println("Developers with preconditions to the job offer:")
    while (developersIterator.hasNext()) {
        developersIterator.next()?.name?.let { println(it) }
    }
}

val zak = Candidate(
    name = "Zak",
    yearsOfExperience = 1
)
val alice = Candidate(
    name = "Alice",
    yearsOfExperience = 1
)
val sara = Candidate(
    name = "Sarah",
    yearsOfExperience = 5
)
val anna = Candidate(
    name = "Anna",
    yearsOfExperience = 3
)