/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_osi_insolvecy_asses_sign&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see OsiAssessmentSignature
 * @generated
 */
public class OsiAssessmentSignatureTable
	extends BaseTable<OsiAssessmentSignatureTable> {

	public static final OsiAssessmentSignatureTable INSTANCE =
		new OsiAssessmentSignatureTable();

	public final Column<OsiAssessmentSignatureTable, Long>
		osiAssessmentSignatureId = createColumn(
			"osiAssessmentSignatureId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<OsiAssessmentSignatureTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<OsiAssessmentSignatureTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<OsiAssessmentSignatureTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<OsiAssessmentSignatureTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<OsiAssessmentSignatureTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<OsiAssessmentSignatureTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<OsiAssessmentSignatureTable, String> assessSignName =
		createColumn(
			"assessSignName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<OsiAssessmentSignatureTable, String> assessSignDate =
		createColumn(
			"assessSignDate", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<OsiAssessmentSignatureTable, Long> osiInsolvencyId =
		createColumn(
			"osiInsolvencyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private OsiAssessmentSignatureTable() {
		super("nbp_osi_insolvecy_asses_sign", OsiAssessmentSignatureTable::new);
	}

}