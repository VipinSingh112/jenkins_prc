/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the SezDevProposedProject service. Represents a row in the &quot;nbp_sez_dev_proposed_project&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see SezDevProposedProjectModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.sez.status.application.form.service.model.impl.SezDevProposedProjectImpl"
)
@ProviderType
public interface SezDevProposedProject
	extends PersistedModel, SezDevProposedProjectModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.sez.status.application.form.service.model.impl.SezDevProposedProjectImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<SezDevProposedProject, Long>
		SEZ_DEV_PROPOSED_PROJECT_ID_ACCESSOR =
			new Accessor<SezDevProposedProject, Long>() {

				@Override
				public Long get(SezDevProposedProject sezDevProposedProject) {
					return sezDevProposedProject.getSezDevProposedProjectId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<SezDevProposedProject> getTypeClass() {
					return SezDevProposedProject.class;
				}

			};

}