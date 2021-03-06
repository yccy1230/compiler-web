package com.ecnu.compiler.common.domain;

import com.ecnu.compiler.lexical.domain.Regex;
import com.ecnu.compiler.rbac.domain.Compiler;
import com.ecnu.compiler.semantic.domain.Action;
import org.springframework.util.ObjectUtils;

import java.util.List;

/**
 * 编译器配置详情
 * @author michaelchen
 */
public class CompilerConfiguration {
    private Compiler compiler;
    private List<Regex> reList;
    private List<Cfg> cfgList;
    private List<Ag> agList;
    private List<Action> actionList;

    public CompilerConfiguration() {
    }

    public CompilerConfiguration(Compiler compiler, List<Regex> reList, List<Cfg> cfgList, List<Ag> agList, List<Action> actionList) {
        this.compiler = compiler;
        this.reList = reList;
        this.cfgList = cfgList;
        this.agList = agList;
        this.actionList = actionList;
    }

    public Compiler getCompiler() {
        return compiler;
    }

    public void setCompiler(Compiler compiler) {
        this.compiler = compiler;
    }

    public List<Regex> getReList() {
        return reList;
    }

    public void setReList(List<Regex> reList) {
        this.reList = reList;
    }

    public List<Cfg> getCfgList() {
        return cfgList;
    }

    public void setCfgList(List<Cfg> cfgList) {
        this.cfgList = cfgList;
    }

    public List<Ag> getAgList() {
        return agList;
    }

    public void setAgList(List<Ag> agList) {
        this.agList = agList;
    }

    public List<Action> getActionList() {
        return actionList;
    }

    public void setActionList(List<Action> actionList) {
        this.actionList = actionList;
    }

    public boolean isNewValid(){
        return !(ObjectUtils.isEmpty(compiler.getCompilerName())
                ||ObjectUtils.isEmpty(compiler.getIntroduce())
                ||ObjectUtils.isEmpty(compiler.getLanguageName())
                ||ObjectUtils.isEmpty(compiler.getLexerModel())
                ||ObjectUtils.isEmpty(compiler.getParserModel()));
    }

    public boolean isModifyValid(){
        return !(ObjectUtils.isEmpty(compiler.getCompilerName())
                ||ObjectUtils.isEmpty(compiler.getIntroduce())
                ||ObjectUtils.isEmpty(compiler.getLanguageName())
                ||ObjectUtils.isEmpty(compiler.getLexerModel())
                ||ObjectUtils.isEmpty(compiler.getParserModel())
                ||ObjectUtils.isEmpty(compiler.getId()));
    }
}
