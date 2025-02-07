/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.medical.facilities.application.form.service.service;

import com.liferay.exportimport.kernel.lar.PortletDataContext;
import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.service.BaseLocalService;
import com.liferay.portal.kernel.service.PersistedModelLocalService;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.medical.facilities.application.form.service.model.MedicalFacilitiesHomeTwo;

import java.io.Serializable;

import java.util.List;

import org.osgi.annotation.versioning.ProviderType;

/**
 * Provides the local service interface for MedicalFacilitiesHomeTwo. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author Brian Wing Shun Chan
 * @see MedicalFacilitiesHomeTwoLocalServiceUtil
 * @generated
 */
@ProviderType
@Transactional(
	isolation = Isolation.PORTAL,
	rollbackFor = {PortalException.class, SystemException.class}
)
public interface MedicalFacilitiesHomeTwoLocalService
	extends BaseLocalService, PersistedModelLocalService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add custom service methods to <code>com.nbp.medical.facilities.application.form.service.service.impl.MedicalFacilitiesHomeTwoLocalServiceImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface. Consume the medical facilities home two local service via injection or a <code>org.osgi.util.tracker.ServiceTracker</code>. Use {@link MedicalFacilitiesHomeTwoLocalServiceUtil} if injection and service tracking are not available.
	 */

	/**
	 * Adds the medical facilities home two to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MedicalFacilitiesHomeTwoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param medicalFacilitiesHomeTwo the medical facilities home two
	 * @return the medical facilities home two that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	public MedicalFacilitiesHomeTwo addMedicalFacilitiesHomeTwo(
		MedicalFacilitiesHomeTwo medicalFacilitiesHomeTwo);

	/**
	 * Creates a new medical facilities home two with the primary key. Does not add the medical facilities home two to the database.
	 *
	 * @param medicalFacilitiesHomeTwoId the primary key for the new medical facilities home two
	 * @return the new medical facilities home two
	 */
	@Transactional(enabled = false)
	public MedicalFacilitiesHomeTwo createMedicalFacilitiesHomeTwo(
		long medicalFacilitiesHomeTwoId);

	/**
	 * @throws PortalException
	 */
	public PersistedModel createPersistedModel(Serializable primaryKeyObj)
		throws PortalException;

	/**
	 * Deletes the medical facilities home two with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MedicalFacilitiesHomeTwoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param medicalFacilitiesHomeTwoId the primary key of the medical facilities home two
	 * @return the medical facilities home two that was removed
	 * @throws PortalException if a medical facilities home two with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	public MedicalFacilitiesHomeTwo deleteMedicalFacilitiesHomeTwo(
			long medicalFacilitiesHomeTwoId)
		throws PortalException;

	/**
	 * Deletes the medical facilities home two from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MedicalFacilitiesHomeTwoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param medicalFacilitiesHomeTwo the medical facilities home two
	 * @return the medical facilities home two that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	public MedicalFacilitiesHomeTwo deleteMedicalFacilitiesHomeTwo(
		MedicalFacilitiesHomeTwo medicalFacilitiesHomeTwo);

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public <T> T dslQuery(DSLQuery dslQuery);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int dslQueryCount(DSLQuery dslQuery);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public DynamicQuery dynamicQuery();

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery);

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.medical.facilities.application.form.service.model.impl.MedicalFacilitiesHomeTwoModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end);

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.medical.facilities.application.form.service.model.impl.MedicalFacilitiesHomeTwoModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<T> orderByComparator);

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public long dynamicQueryCount(DynamicQuery dynamicQuery);

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public long dynamicQueryCount(
		DynamicQuery dynamicQuery, Projection projection);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public MedicalFacilitiesHomeTwo fetchMedicalFacilitiesHomeTwo(
		long medicalFacilitiesHomeTwoId);

	/**
	 * Returns the medical facilities home two matching the UUID and group.
	 *
	 * @param uuid the medical facilities home two's UUID
	 * @param groupId the primary key of the group
	 * @return the matching medical facilities home two, or <code>null</code> if a matching medical facilities home two could not be found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public MedicalFacilitiesHomeTwo
		fetchMedicalFacilitiesHomeTwoByUuidAndGroupId(
			String uuid, long groupId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ActionableDynamicQuery getActionableDynamicQuery();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ExportActionableDynamicQuery getExportActionableDynamicQuery(
		PortletDataContext portletDataContext);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public IndexableActionableDynamicQuery getIndexableActionableDynamicQuery();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<MedicalFacilitiesHomeTwo> getMedicalFacilitiesAppliInfoBy_Id(
		long applicationId);

	/**
	 * Returns the medical facilities home two with the primary key.
	 *
	 * @param medicalFacilitiesHomeTwoId the primary key of the medical facilities home two
	 * @return the medical facilities home two
	 * @throws PortalException if a medical facilities home two with the primary key could not be found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public MedicalFacilitiesHomeTwo getMedicalFacilitiesHomeTwo(
			long medicalFacilitiesHomeTwoId)
		throws PortalException;

	/**
	 * Returns the medical facilities home two matching the UUID and group.
	 *
	 * @param uuid the medical facilities home two's UUID
	 * @param groupId the primary key of the group
	 * @return the matching medical facilities home two
	 * @throws PortalException if a matching medical facilities home two could not be found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public MedicalFacilitiesHomeTwo getMedicalFacilitiesHomeTwoByUuidAndGroupId(
			String uuid, long groupId)
		throws PortalException;

	/**
	 * Returns a range of all the medical facilities home twos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.medical.facilities.application.form.service.model.impl.MedicalFacilitiesHomeTwoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of medical facilities home twos
	 * @param end the upper bound of the range of medical facilities home twos (not inclusive)
	 * @return the range of medical facilities home twos
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<MedicalFacilitiesHomeTwo> getMedicalFacilitiesHomeTwos(
		int start, int end);

	/**
	 * Returns all the medical facilities home twos matching the UUID and company.
	 *
	 * @param uuid the UUID of the medical facilities home twos
	 * @param companyId the primary key of the company
	 * @return the matching medical facilities home twos, or an empty list if no matches were found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<MedicalFacilitiesHomeTwo>
		getMedicalFacilitiesHomeTwosByUuidAndCompanyId(
			String uuid, long companyId);

	/**
	 * Returns a range of medical facilities home twos matching the UUID and company.
	 *
	 * @param uuid the UUID of the medical facilities home twos
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of medical facilities home twos
	 * @param end the upper bound of the range of medical facilities home twos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching medical facilities home twos, or an empty list if no matches were found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<MedicalFacilitiesHomeTwo>
		getMedicalFacilitiesHomeTwosByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			OrderByComparator<MedicalFacilitiesHomeTwo> orderByComparator);

	/**
	 * Returns the number of medical facilities home twos.
	 *
	 * @return the number of medical facilities home twos
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getMedicalFacilitiesHomeTwosCount();

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public String getOSGiServiceIdentifier();

	/**
	 * @throws PortalException
	 */
	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException;

	/**
	 * Updates the medical facilities home two in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MedicalFacilitiesHomeTwoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param medicalFacilitiesHomeTwo the medical facilities home two
	 * @return the medical facilities home two that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	public MedicalFacilitiesHomeTwo updateMedicalFacilitiesHomeTwo(
		MedicalFacilitiesHomeTwo medicalFacilitiesHomeTwo);

}