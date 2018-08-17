package com.sgaop.idea.codeinsight.folding;

import com.intellij.lang.ASTNode;
import com.intellij.lang.folding.FoldingDescriptor;
import com.intellij.openapi.util.TextRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 黄川 huchuc@vip.qq.com

 * 创建时间: 2018/1/25  10:56

 */
public class NutzLocalizationFoldingDescriptor extends FoldingDescriptor {

    private String value;

    public NutzLocalizationFoldingDescriptor(@NotNull ASTNode node, @NotNull TextRange range, String value) {
        super(node, range);
        this.value = value;
    }


    @Nullable
    @Override
    public String getPlaceholderText() {
        String valueOf = this.value;
        return valueOf == null ? "" : valueOf.replaceAll("\n", "\\n").replaceAll("\"", "\\\\\"");
    }
}
