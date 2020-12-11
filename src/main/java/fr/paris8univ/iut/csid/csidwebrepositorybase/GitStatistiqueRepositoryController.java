package fr.paris8univ.iut.csid.csidwebrepositorybase;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/repositories/{name}")
public class GitStatistiqueRepositoryController {

    @GetMapping("/stats")
    public List<GitStatistiqueRepository> getStats(@RequestParam String statistiqueType, String repositoryName)
    {
        return GitStatistiqueRepositoryService.GitStatistique();
    }
}
