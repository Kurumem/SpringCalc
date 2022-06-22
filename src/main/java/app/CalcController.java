package app;

import entities.CalcEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalcController {
    @GetMapping("/sum")
    public CalcEntity getSum(@RequestParam(value = "first")  double first, @RequestParam double sec){

        double sum = first + sec;
        double scale = Math.pow(10,3);

        return new CalcEntity(first,sec, Math.ceil(sum*scale)/scale);
    }

    @GetMapping("/sub")
    public CalcEntity getSub(@RequestParam(value = "first")  double first, @RequestParam double sec){
        double sub = first - sec;
        double scale = Math.pow(10,3);

        return new CalcEntity(first,sec, Math.ceil(sub*scale)/scale);
    }

    @GetMapping("/multi")
    public CalcEntity getMulti(@RequestParam(value = "first")  double first, @RequestParam double sec){
        double multi = first * sec;
        double scale = Math.pow(10,3);

        return new CalcEntity(first,sec, Math.ceil(multi*scale)/scale);
    }

    @GetMapping("/div")
    public CalcEntity getDiv(@RequestParam(value = "first")  double first, @RequestParam double sec){
        double div = first / sec;
        double scale = Math.pow(10,3);

        return new CalcEntity(first,sec, Math.ceil(div*scale)/scale);
    }


}
