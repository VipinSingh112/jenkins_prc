/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.pharmaceutical.application.form.service.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

/**
 * The table class for the &quot;nbp_pharma_doc_list&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see PharmaDocumentList
 * @generated
 */
public class PharmaDocumentListTable
	extends BaseTable<PharmaDocumentListTable> {

	public static final PharmaDocumentListTable INSTANCE =
		new PharmaDocumentListTable();

	public final Column<PharmaDocumentListTable, Long> pharmaDocListId =
		createColumn(
			"pharmaDocListId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<PharmaDocumentListTable, String> pharmaAppType =
		createColumn(
			"pharmaAppType", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<PharmaDocumentListTable, String> pharmaDocList =
		createColumn(
			"pharmaDocList", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	private PharmaDocumentListTable() {
		super("nbp_pharma_doc_list", PharmaDocumentListTable::new);
	}

}