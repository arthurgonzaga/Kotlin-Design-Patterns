package behaviour.iterator.offers

import behaviour.iterator.Candidate
import behaviour.iterator.iterators.CookerCandidatesIterator
import behaviour.iterator.iterators.DeveloperCandidatesIterator

class DeveloperJobOffer(
    vararg candidates: Candidate
): JobOffer(*candidates) {
    override fun iterator(): DeveloperCandidatesIterator = DeveloperCandidatesIterator(jobOffer = this)
}