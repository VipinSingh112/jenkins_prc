/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ogt.application.form.services.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the OgtSectionB service. Represents a row in the &quot;nbp_ogt_section_b&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see OgtSectionBModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.ogt.application.form.services.model.impl.OgtSectionBImpl"
)
@ProviderType
public interface OgtSectionB extends OgtSectionBModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.ogt.application.form.services.model.impl.OgtSectionBImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<OgtSectionB, Long> OGT_SECTION_B_ID_ACCESSOR =
		new Accessor<OgtSectionB, Long>() {

			@Override
			public Long get(OgtSectionB ogtSectionB) {
				return ogtSectionB.getOgtSectionBId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<OgtSectionB> getTypeClass() {
				return OgtSectionB.class;
			}

		};

}