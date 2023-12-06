import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.math.BigInteger;
import java.security.SecureRandom;

@RestController
@RequestMapping("/prime")
public class PrimeController {

    @GetMapping
    public String generateNewPrime() {
        BigInteger probablePrime = BigInteger.probablePrime(10000, new SecureRandom());
        return probablePrime.toString();
    }
}
