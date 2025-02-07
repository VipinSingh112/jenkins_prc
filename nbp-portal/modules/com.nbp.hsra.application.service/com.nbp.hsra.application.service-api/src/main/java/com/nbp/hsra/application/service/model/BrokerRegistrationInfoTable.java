/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_hsra_broker_regst&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see BrokerRegistrationInfo
 * @generated
 */
public class BrokerRegistrationInfoTable
	extends BaseTable<BrokerRegistrationInfoTable> {

	public static final BrokerRegistrationInfoTable INSTANCE =
		new BrokerRegistrationInfoTable();

	public final Column<BrokerRegistrationInfoTable, Long> brokerRegstInfoId =
		createColumn(
			"brokerRegstInfoId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<BrokerRegistrationInfoTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<BrokerRegistrationInfoTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<BrokerRegistrationInfoTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<BrokerRegistrationInfoTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<BrokerRegistrationInfoTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<BrokerRegistrationInfoTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<BrokerRegistrationInfoTable, String> applicationTypes =
		createColumn(
			"applicationTypes", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<BrokerRegistrationInfoTable, String> organizationNameD =
		createColumn(
			"organizationNameD", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<BrokerRegistrationInfoTable, String> businessPlace =
		createColumn(
			"businessPlace", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<BrokerRegistrationInfoTable, String> organizationTrn =
		createColumn(
			"organizationTrn", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<BrokerRegistrationInfoTable, String>
		organizationTeleNum = createColumn(
			"organizationTeleNum", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<BrokerRegistrationInfoTable, String>
		organizationFaxNum = createColumn(
			"organizationFaxNum", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<BrokerRegistrationInfoTable, String>
		organizationEmailAdd = createColumn(
			"organizationEmailAdd", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<BrokerRegistrationInfoTable, String>
		businessTypeBroker = createColumn(
			"businessTypeBroker", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<BrokerRegistrationInfoTable, String>
		businessNumberBroker = createColumn(
			"businessNumberBroker", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<BrokerRegistrationInfoTable, String>
		corporationNumberBroker = createColumn(
			"corporationNumberBroker", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<BrokerRegistrationInfoTable, String> publicActBroker =
		createColumn(
			"publicActBroker", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<BrokerRegistrationInfoTable, String>
		licenceNumberBroker = createColumn(
			"licenceNumberBroker", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<BrokerRegistrationInfoTable, Date>
		expirationDateBroker = createColumn(
			"expirationDateBroker", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<BrokerRegistrationInfoTable, String>
		radioactiveMaterial = createColumn(
			"radioactiveMaterial", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<BrokerRegistrationInfoTable, String> nuclearMaterial =
		createColumn(
			"nuclearMaterial", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<BrokerRegistrationInfoTable, String> nuclearTechnology =
		createColumn(
			"nuclearTechnology", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<BrokerRegistrationInfoTable, String> ionizingApparatus =
		createColumn(
			"ionizingApparatus", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<BrokerRegistrationInfoTable, String> radiationSource =
		createColumn(
			"radiationSource", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<BrokerRegistrationInfoTable, String>
		organizationTransfer = createColumn(
			"organizationTransfer", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<BrokerRegistrationInfoTable, String> nuclearProtection =
		createColumn(
			"nuclearProtection", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<BrokerRegistrationInfoTable, String> storageFacility =
		createColumn(
			"storageFacility", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<BrokerRegistrationInfoTable, String>
		additionalInformation = createColumn(
			"additionalInformation", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<BrokerRegistrationInfoTable, Long> hsraApplicationId =
		createColumn(
			"hsraApplicationId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private BrokerRegistrationInfoTable() {
		super("nbp_hsra_broker_regst", BrokerRegistrationInfoTable::new);
	}

}