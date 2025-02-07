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

import com.nbp.medical.facilities.application.form.service.exception.NoSuchMedicalFacilitiesAppException;
import com.nbp.medical.facilities.application.form.service.model.MedicalFacilitiesApp;

import java.io.Serializable;

import java.util.List;

import org.osgi.annotation.versioning.ProviderType;

/**
 * Provides the local service interface for MedicalFacilitiesApp. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author Brian Wing Shun Chan
 * @see MedicalFacilitiesAppLocalServiceUtil
 * @generated
 */
@ProviderType
@Transactional(
	isolation = Isolation.PORTAL,
	rollbackFor = {PortalException.class, SystemException.class}
)
public interface MedicalFacilitiesAppLocalService
	extends BaseLocalService, PersistedModelLocalService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add custom service methods to <code>com.nbp.medical.facilities.application.form.service.service.impl.MedicalFacilitiesAppLocalServiceImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface. Consume the medical facilities app local service via injection or a <code>org.osgi.util.tracker.ServiceTracker</code>. Use {@link MedicalFacilitiesAppLocalServiceUtil} if injection and service tracking are not available.
	 */

	/**
	 * Adds the medical facilities app to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MedicalFacilitiesAppLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param medicalFacilitiesApp the medical facilities app
	 * @return the medical facilities app that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	public MedicalFacilitiesApp addMedicalFacilitiesApp(
		MedicalFacilitiesApp medicalFacilitiesApp);

	/**
	 * Creates a new medical facilities app with the primary key. Does not add the medical facilities app to the database.
	 *
	 * @param medicalFacilitiesAppId the primary key for the new medical facilities app
	 * @return the new medical facilities app
	 */
	@Transactional(enabled = false)
	public MedicalFacilitiesApp createMedicalFacilitiesApp(
		long medicalFacilitiesAppId);

	/**
	 * @throws PortalException
	 */
	public PersistedModel createPersistedModel(Serializable primaryKeyObj)
		throws PortalException;

	/**
	 * Deletes the medical facilities app with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MedicalFacilitiesAppLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param medicalFacilitiesAppId the primary key of the medical facilities app
	 * @return the medical facilities app that was removed
	 * @throws PortalException if a medical facilities app with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	public MedicalFacilitiesApp deleteMedicalFacilitiesApp(
			long medicalFacilitiesAppId)
		throws PortalException;

	/**
	 * Deletes the medical facilities app from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MedicalFacilitiesAppLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param medicalFacilitiesApp the medical facilities app
	 * @return the medical facilities app that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	public MedicalFacilitiesApp deleteMedicalFacilitiesApp(
		MedicalFacilitiesApp medicalFacilitiesApp);

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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.medical.facilities.application.form.service.model.impl.MedicalFacilitiesAppModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.medical.facilities.application.form.service.model.impl.MedicalFacilitiesAppModelImpl</code>.
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
	public MedicalFacilitiesApp fetchMedicalFacilitiesApp(
		long medicalFacilitiesAppId);

	/**
	 * Returns the medical facilities app matching the UUID and group.
	 *
	 * @param uuid the medical facilities app's UUID
	 * @param groupId the primary key of the group
	 * @return the matching medical facilities app, or <code>null</code> if a matching medical facilities app could not be found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public MedicalFacilitiesApp fetchMedicalFacilitiesAppByUuidAndGroupId(
		String uuid, long groupId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ActionableDynamicQuery getActionableDynamicQuery();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ExportActionableDynamicQuery getExportActionableDynamicQuery(
		PortletDataContext portletDataContext);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public IndexableActionableDynamicQuery getIndexableActionableDynamicQuery();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public MedicalFacilitiesApp getMedicalApplicationByExpiredNUmber(
		String expiredLicenceNUmber);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public MedicalFacilitiesApp getMedicalByAppNo(String applicationNumber)
		throws NoSuchMedicalFacilitiesAppException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<String> getMedicalDistinctCategories();

	/**
	 * Returns the medical facilities app with the primary key.
	 *
	 * @param medicalFacilitiesAppId the primary key of the medical facilities app
	 * @return the medical facilities app
	 * @throws PortalException if a medical facilities app with the primary key could not be found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public MedicalFacilitiesApp getMedicalFacilitiesApp(
			long medicalFacilitiesAppId)
		throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<MedicalFacilitiesApp> getMedicalFacilitiesAppBy_S_U(
		int status, long userId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<MedicalFacilitiesApp> getMedicalFacilitiesAppBy_Status(
		int status);

	/**
	 * Returns the medical facilities app matching the UUID and group.
	 *
	 * @param uuid the medical facilities app's UUID
	 * @param groupId the primary key of the group
	 * @return the matching medical facilities app
	 * @throws PortalException if a matching medical facilities app could not be found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public MedicalFacilitiesApp getMedicalFacilitiesAppByUuidAndGroupId(
			String uuid, long groupId)
		throws PortalException;

	/**
	 * Returns a range of all the medical facilities apps.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.medical.facilities.application.form.service.model.impl.MedicalFacilitiesAppModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of medical facilities apps
	 * @param end the upper bound of the range of medical facilities apps (not inclusive)
	 * @return the range of medical facilities apps
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<MedicalFacilitiesApp> getMedicalFacilitiesApps(
		int start, int end);

	/**
	 * Returns all the medical facilities apps matching the UUID and company.
	 *
	 * @param uuid the UUID of the medical facilities apps
	 * @param companyId the primary key of the company
	 * @return the matching medical facilities apps, or an empty list if no matches were found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<MedicalFacilitiesApp>
		getMedicalFacilitiesAppsByUuidAndCompanyId(String uuid, long companyId);

	/**
	 * Returns a range of medical facilities apps matching the UUID and company.
	 *
	 * @param uuid the UUID of the medical facilities apps
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of medical facilities apps
	 * @param end the upper bound of the range of medical facilities apps (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching medical facilities apps, or an empty list if no matches were found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<MedicalFacilitiesApp>
		getMedicalFacilitiesAppsByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			OrderByComparator<MedicalFacilitiesApp> orderByComparator);

	/**
	 * Returns the number of medical facilities apps.
	 *
	 * @return the number of medical facilities apps
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getMedicalFacilitiesAppsCount();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public MedicalFacilitiesApp getMedicalFacilitiesByCaseId(String caseId)
		throws NoSuchMedicalFacilitiesAppException;

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
	 * Updates the medical facilities app in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MedicalFacilitiesAppLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param medicalFacilitiesApp the medical facilities app
	 * @return the medical facilities app that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	public MedicalFacilitiesApp updateMedicalFacilitiesApp(
		MedicalFacilitiesApp medicalFacilitiesApp);

}