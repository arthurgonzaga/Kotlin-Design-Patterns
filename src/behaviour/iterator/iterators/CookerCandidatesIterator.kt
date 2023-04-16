package behaviour.iterator.iterators

import behaviour.iterator.Candidate
import behaviour.iterator.JobOffer

class CookerCandidatesIterator(
    private val jobOffer: JobOffer
): Iterator<Candidate?>{

    var index = 0

    override fun hasNext(): Boolean {
        return index < jobOffer.candidates.size
    }

    override fun next(): Candidate? {
        val candidates = jobOffer.candidates
        return if(hasNext()) {
            val candidate = candidates[index++]
            if(preconditions(candidate)) {
                candidate
            } else {
                next()
            }
        } else {
            null
        }
    }

    private fun preconditions(candidate: Candidate): Boolean {
        return candidate.yearsOfExperience > 1
    }

}