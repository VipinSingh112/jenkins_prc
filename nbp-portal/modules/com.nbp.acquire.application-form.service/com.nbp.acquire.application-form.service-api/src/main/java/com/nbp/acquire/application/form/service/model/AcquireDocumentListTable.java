/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.acquire.application.form.service.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

/**
 * The table class for the &quot;nbp_acquire_document_list&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see AcquireDocumentList
 * @generated
 */
public class AcquireDocumentListTable
	extends BaseTable<AcquireDocumentListTable> {

	public static final AcquireDocumentListTable INSTANCE =
		new AcquireDocumentListTable();

	public final Column<AcquireDocumentListTable, Long> acquireDocumentListId =
		createColumn(
			"acquireDocumentListId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<AcquireDocumentListTable, String> documentType =
		createColumn(
			"documentType", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AcquireDocumentListTable, String> documentName =
		createColumn(
			"documentName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	private AcquireDocumentListTable() {
		super("nbp_acquire_document_list", AcquireDocumentListTable::new);
	}

}