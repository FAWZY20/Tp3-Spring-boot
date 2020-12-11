package fr.paris8univ.iut.csid.csidwebrepositorybase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GitStatistiqueRepositoryService {

    private final GitStatistiqueRepository statistiqueRepository;

    @Autowired
    public GitStatistiqueRepositoryService(GitStatistiqueRepository statistiqueRepository)
    {
        this.statistiqueRepository = statistiqueRepository;
    }

    public List<GitStatistiqueEntity> GitStatistique(String repositoryName,String statistiqueType)
    {
        return statistiqueRepository.GitStatistique(repositoryName,statistiqueType);
    }
}
