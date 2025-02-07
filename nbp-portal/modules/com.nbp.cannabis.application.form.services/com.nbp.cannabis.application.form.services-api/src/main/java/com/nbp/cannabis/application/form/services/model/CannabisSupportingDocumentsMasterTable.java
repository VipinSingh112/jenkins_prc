/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.cannabis.application.form.services.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

/**
 * The table class for the &quot;nbp_cannabis_supporting_docs&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see CannabisSupportingDocumentsMaster
 * @generated
 */
public class CannabisSupportingDocumentsMasterTable
	extends BaseTable<CannabisSupportingDocumentsMasterTable> {

	public static final CannabisSupportingDocumentsMasterTable INSTANCE =
		new CannabisSupportingDocumentsMasterTable();

	public final Column<CannabisSupportingDocumentsMasterTable, Long>
		cannabisSupportingDocMasterId = createColumn(
			"cannabisSupportingDocMasterId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<CannabisSupportingDocumentsMasterTable, String>
		applicationType = createColumn(
			"applicationType", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<CannabisSupportingDocumentsMasterTable, String>
		documentTye = createColumn(
			"documentTye", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CannabisSupportingDocumentsMasterTable, String>
		landType = createColumn(
			"landType", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CannabisSupportingDocumentsMasterTable, String>
		userType = createColumn(
			"userType", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CannabisSupportingDocumentsMasterTable, String>
		documentName = createColumn(
			"documentName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CannabisSupportingDocumentsMasterTable, String>
		remarks = createColumn(
			"remarks", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CannabisSupportingDocumentsMasterTable, String> status =
		createColumn(
			"status", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	private CannabisSupportingDocumentsMasterTable() {
		super(
			"nbp_cannabis_supporting_docs",
			CannabisSupportingDocumentsMasterTable::new);
	}

}