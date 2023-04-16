package behaviour.iterator.offers

import behaviour.iterator.Candidate
import behaviour.iterator.iterators.CookerCandidatesIterator

class CookerJobOffer(
    vararg candidates: Candidate
): JobOffer(*candidates) {

    override fun iterator(): CookerCandidatesIterator = CookerCandidatesIterator(jobOffer = this)
}