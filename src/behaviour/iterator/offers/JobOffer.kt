package behaviour.iterator.offers

import behaviour.iterator.Candidate

abstract class JobOffer(
    vararg candidates: Candidate
): Iterable<Candidate?> {
    val candidates = candidates
}