/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the DirectorsForm service. Represents a row in the &quot;nbp_osi_directors_form&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see DirectorsFormModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.osi.insolvency.application.form.services.model.impl.DirectorsFormImpl"
)
@ProviderType
public interface DirectorsForm extends DirectorsFormModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.osi.insolvency.application.form.services.model.impl.DirectorsFormImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<DirectorsForm, Long>
		DIRECTORS_FORM_ID_ACCESSOR = new Accessor<DirectorsForm, Long>() {

			@Override
			public Long get(DirectorsForm directorsForm) {
				return directorsForm.getDirectorsFormId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<DirectorsForm> getTypeClass() {
				return DirectorsForm.class;
			}

		};

}