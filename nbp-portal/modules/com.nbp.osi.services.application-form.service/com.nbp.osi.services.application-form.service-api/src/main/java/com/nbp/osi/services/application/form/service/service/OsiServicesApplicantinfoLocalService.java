/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.services.application.form.service.service;

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

import com.nbp.osi.services.application.form.service.exception.NoSuchOsiServicesApplicantinfoException;
import com.nbp.osi.services.application.form.service.model.OsiServicesApplicantinfo;

import java.io.Serializable;

import java.util.List;

import org.osgi.annotation.versioning.ProviderType;

/**
 * Provides the local service interface for OsiServicesApplicantinfo. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author Brian Wing Shun Chan
 * @see OsiServicesApplicantinfoLocalServiceUtil
 * @generated
 */
@ProviderType
@Transactional(
	isolation = Isolation.PORTAL,
	rollbackFor = {PortalException.class, SystemException.class}
)
public interface OsiServicesApplicantinfoLocalService
	extends BaseLocalService, PersistedModelLocalService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add custom service methods to <code>com.nbp.osi.services.application.form.service.service.impl.OsiServicesApplicantinfoLocalServiceImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface. Consume the osi services applicantinfo local service via injection or a <code>org.osgi.util.tracker.ServiceTracker</code>. Use {@link OsiServicesApplicantinfoLocalServiceUtil} if injection and service tracking are not available.
	 */

	/**
	 * Adds the osi services applicantinfo to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiServicesApplicantinfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiServicesApplicantinfo the osi services applicantinfo
	 * @return the osi services applicantinfo that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	public OsiServicesApplicantinfo addOsiServicesApplicantinfo(
		OsiServicesApplicantinfo osiServicesApplicantinfo);

	/**
	 * Creates a new osi services applicantinfo with the primary key. Does not add the osi services applicantinfo to the database.
	 *
	 * @param osiServicesApplicanId the primary key for the new osi services applicantinfo
	 * @return the new osi services applicantinfo
	 */
	@Transactional(enabled = false)
	public OsiServicesApplicantinfo createOsiServicesApplicantinfo(
		long osiServicesApplicanId);

	/**
	 * @throws PortalException
	 */
	public PersistedModel createPersistedModel(Serializable primaryKeyObj)
		throws PortalException;

	/**
	 * Deletes the osi services applicantinfo with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiServicesApplicantinfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiServicesApplicanId the primary key of the osi services applicantinfo
	 * @return the osi services applicantinfo that was removed
	 * @throws PortalException if a osi services applicantinfo with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	public OsiServicesApplicantinfo deleteOsiServicesApplicantinfo(
			long osiServicesApplicanId)
		throws PortalException;

	/**
	 * Deletes the osi services applicantinfo from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiServicesApplicantinfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiServicesApplicantinfo the osi services applicantinfo
	 * @return the osi services applicantinfo that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	public OsiServicesApplicantinfo deleteOsiServicesApplicantinfo(
		OsiServicesApplicantinfo osiServicesApplicantinfo);

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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.services.application.form.service.model.impl.OsiServicesApplicantinfoModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.services.application.form.service.model.impl.OsiServicesApplicantinfoModelImpl</code>.
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
	public OsiServicesApplicantinfo fetchOsiServicesApplicantinfo(
		long osiServicesApplicanId);

	/**
	 * Returns the osi services applicantinfo matching the UUID and group.
	 *
	 * @param uuid the osi services applicantinfo's UUID
	 * @param groupId the primary key of the group
	 * @return the matching osi services applicantinfo, or <code>null</code> if a matching osi services applicantinfo could not be found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public OsiServicesApplicantinfo
		fetchOsiServicesApplicantinfoByUuidAndGroupId(
			String uuid, long groupId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ActionableDynamicQuery getActionableDynamicQuery();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ExportActionableDynamicQuery getExportActionableDynamicQuery(
		PortletDataContext portletDataContext);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public IndexableActionableDynamicQuery getIndexableActionableDynamicQuery();

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public String getOSGiServiceIdentifier();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public OsiServicesApplicantinfo getOsiServiceApplicantInfoById(
			long osiServicesApplicationId)
		throws NoSuchOsiServicesApplicantinfoException;

	/**
	 * Returns the osi services applicantinfo with the primary key.
	 *
	 * @param osiServicesApplicanId the primary key of the osi services applicantinfo
	 * @return the osi services applicantinfo
	 * @throws PortalException if a osi services applicantinfo with the primary key could not be found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public OsiServicesApplicantinfo getOsiServicesApplicantinfo(
			long osiServicesApplicanId)
		throws PortalException;

	/**
	 * Returns the osi services applicantinfo matching the UUID and group.
	 *
	 * @param uuid the osi services applicantinfo's UUID
	 * @param groupId the primary key of the group
	 * @return the matching osi services applicantinfo
	 * @throws PortalException if a matching osi services applicantinfo could not be found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public OsiServicesApplicantinfo getOsiServicesApplicantinfoByUuidAndGroupId(
			String uuid, long groupId)
		throws PortalException;

	/**
	 * Returns a range of all the osi services applicantinfos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.services.application.form.service.model.impl.OsiServicesApplicantinfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi services applicantinfos
	 * @param end the upper bound of the range of osi services applicantinfos (not inclusive)
	 * @return the range of osi services applicantinfos
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<OsiServicesApplicantinfo> getOsiServicesApplicantinfos(
		int start, int end);

	/**
	 * Returns all the osi services applicantinfos matching the UUID and company.
	 *
	 * @param uuid the UUID of the osi services applicantinfos
	 * @param companyId the primary key of the company
	 * @return the matching osi services applicantinfos, or an empty list if no matches were found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<OsiServicesApplicantinfo>
		getOsiServicesApplicantinfosByUuidAndCompanyId(
			String uuid, long companyId);

	/**
	 * Returns a range of osi services applicantinfos matching the UUID and company.
	 *
	 * @param uuid the UUID of the osi services applicantinfos
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of osi services applicantinfos
	 * @param end the upper bound of the range of osi services applicantinfos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching osi services applicantinfos, or an empty list if no matches were found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<OsiServicesApplicantinfo>
		getOsiServicesApplicantinfosByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			OrderByComparator<OsiServicesApplicantinfo> orderByComparator);

	/**
	 * Returns the number of osi services applicantinfos.
	 *
	 * @return the number of osi services applicantinfos
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getOsiServicesApplicantinfosCount();

	/**
	 * @throws PortalException
	 */
	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException;

	/**
	 * Updates the osi services applicantinfo in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiServicesApplicantinfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiServicesApplicantinfo the osi services applicantinfo
	 * @return the osi services applicantinfo that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	public OsiServicesApplicantinfo updateOsiServicesApplicantinfo(
		OsiServicesApplicantinfo osiServicesApplicantinfo);

}