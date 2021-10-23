package sn.mdk.articlewebservice.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import sn.mdk.articlewebservice.dto.CategorieDto;
import sn.mdk.articlewebservice.service.ICategorieService;

import java.util.List;

@RestController
@RequestMapping("/categories")
@AllArgsConstructor
public class CategorieController {
    private final ICategorieService iCategorieService;

    @GetMapping
    public List<CategorieDto> showAllCategory(){
        return iCategorieService.listCategorie();
    }

    @GetMapping("/{id}")
    public CategorieDto getCategorieById(@PathVariable Long id){
            return iCategorieService.getCategorieById(id);
    }

    @PostMapping
    public String saveCategorie(@RequestBody CategorieDto categorieDto){
        return iCategorieService.addCategorie(categorieDto);
    }

    @PutMapping("/{id}")
    public  String updateCategorie(@RequestBody CategorieDto categorieDto){
        return iCategorieService.updateCategorie(categorieDto);
    }

    @DeleteMapping("/{id}")
    public String deleteCategorie(@PathVariable Long id){
        return iCategorieService.deleteCategorie(id);
    }
}
