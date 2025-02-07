/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.mining.lease.application.service.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_exclusive_form_five&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see MiningExclusiveLicFormFive
 * @generated
 */
public class MiningExclusiveLicFormFiveTable
	extends BaseTable<MiningExclusiveLicFormFiveTable> {

	public static final MiningExclusiveLicFormFiveTable INSTANCE =
		new MiningExclusiveLicFormFiveTable();

	public final Column<MiningExclusiveLicFormFiveTable, Long>
		miningExclusiveLicFormFiveId = createColumn(
			"miningExclusiveLicFormFiveId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<MiningExclusiveLicFormFiveTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<MiningExclusiveLicFormFiveTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<MiningExclusiveLicFormFiveTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<MiningExclusiveLicFormFiveTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<MiningExclusiveLicFormFiveTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<MiningExclusiveLicFormFiveTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<MiningExclusiveLicFormFiveTable, String>
		applicantNameLicence = createColumn(
			"applicantNameLicence", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<MiningExclusiveLicFormFiveTable, String>
		trnNumberLicence = createColumn(
			"trnNumberLicence", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<MiningExclusiveLicFormFiveTable, String>
		applicantNationalityLicence = createColumn(
			"applicantNationalityLicence", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<MiningExclusiveLicFormFiveTable, String>
		applicantAddressLicence = createColumn(
			"applicantAddressLicence", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<MiningExclusiveLicFormFiveTable, String>
		applicantTelephoneLicence = createColumn(
			"applicantTelephoneLicence", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<MiningExclusiveLicFormFiveTable, String>
		applicantEmailLicence = createColumn(
			"applicantEmailLicence", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<MiningExclusiveLicFormFiveTable, String>
		applicantNumberLicence = createColumn(
			"applicantNumberLicence", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<MiningExclusiveLicFormFiveTable, String>
		agentNameLicence = createColumn(
			"agentNameLicence", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<MiningExclusiveLicFormFiveTable, String>
		numProspectingLicence = createColumn(
			"numProspectingLicence", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<MiningExclusiveLicFormFiveTable, String>
		agentNameLicenceGrant = createColumn(
			"agentNameLicenceGrant", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<MiningExclusiveLicFormFiveTable, String>
		applicantLicence = createColumn(
			"applicantLicence", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<MiningExclusiveLicFormFiveTable, String>
		justicePeaceParish = createColumn(
			"justicePeaceParish", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<MiningExclusiveLicFormFiveTable, String>
		applicantLandmarkLicence = createColumn(
			"applicantLandmarkLicence", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<MiningExclusiveLicFormFiveTable, String>
		applicantAreaLicence = createColumn(
			"applicantAreaLicence", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<MiningExclusiveLicFormFiveTable, String>
		applicantDesires = createColumn(
			"applicantDesires", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<MiningExclusiveLicFormFiveTable, Date> dateLocationLic =
		createColumn(
			"dateLocationLic", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<MiningExclusiveLicFormFiveTable, String>
		incorporationLodged = createColumn(
			"incorporationLodged", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<MiningExclusiveLicFormFiveTable, Long>
		miningLeaseApplicationId = createColumn(
			"miningLeaseApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private MiningExclusiveLicFormFiveTable() {
		super("nbp_exclusive_form_five", MiningExclusiveLicFormFiveTable::new);
	}

}