/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the AddPhyResourceSec service. Represents a row in the &quot;nbp_janaac_add_ins_phy_sec&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see AddPhyResourceSecModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.janaac.application.form.service.model.impl.AddPhyResourceSecImpl"
)
@ProviderType
public interface AddPhyResourceSec
	extends AddPhyResourceSecModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.janaac.application.form.service.model.impl.AddPhyResourceSecImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<AddPhyResourceSec, Long>
		ADD_PHY_RESOURCE_SEC_ID_ACCESSOR =
			new Accessor<AddPhyResourceSec, Long>() {

				@Override
				public Long get(AddPhyResourceSec addPhyResourceSec) {
					return addPhyResourceSec.getAddPhyResourceSecId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<AddPhyResourceSec> getTypeClass() {
					return AddPhyResourceSec.class;
				}

			};

}