package behaviour.iterator

import behaviour.iterator.iterators.CookerCandidatesIterator
import behaviour.iterator.iterators.DeveloperCandidatesIterator

fun main() {
    val cookerJobOffer = JobOffer(zak, alice, sara, anna)

    val cookersIterator = CookerCandidatesIterator(cookerJobOffer)

    println("Cookers with preconditions to the job offer:")
    while (cookersIterator.hasNext()) {
        cookersIterator.next()?.name?.let { println(it) }
    }

    print("\n")

    val developerJobOffer = JobOffer(zak, alice, sara, anna)
    val developersIterator = DeveloperCandidatesIterator(developerJobOffer)

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