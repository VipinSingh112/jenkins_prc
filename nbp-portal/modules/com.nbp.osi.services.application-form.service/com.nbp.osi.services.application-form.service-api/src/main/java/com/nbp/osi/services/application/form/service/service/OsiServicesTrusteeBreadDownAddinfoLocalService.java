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

import com.nbp.osi.services.application.form.service.model.OsiServicesTrusteeBreadDownAddinfo;

import java.io.Serializable;

import java.util.List;

import org.osgi.annotation.versioning.ProviderType;

/**
 * Provides the local service interface for OsiServicesTrusteeBreadDownAddinfo. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author Brian Wing Shun Chan
 * @see OsiServicesTrusteeBreadDownAddinfoLocalServiceUtil
 * @generated
 */
@ProviderType
@Transactional(
	isolation = Isolation.PORTAL,
	rollbackFor = {PortalException.class, SystemException.class}
)
public interface OsiServicesTrusteeBreadDownAddinfoLocalService
	extends BaseLocalService, PersistedModelLocalService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add custom service methods to <code>com.nbp.osi.services.application.form.service.service.impl.OsiServicesTrusteeBreadDownAddinfoLocalServiceImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface. Consume the osi services trustee bread down addinfo local service via injection or a <code>org.osgi.util.tracker.ServiceTracker</code>. Use {@link OsiServicesTrusteeBreadDownAddinfoLocalServiceUtil} if injection and service tracking are not available.
	 */

	/**
	 * Adds the osi services trustee bread down addinfo to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiServicesTrusteeBreadDownAddinfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiServicesTrusteeBreadDownAddinfo the osi services trustee bread down addinfo
	 * @return the osi services trustee bread down addinfo that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	public OsiServicesTrusteeBreadDownAddinfo
		addOsiServicesTrusteeBreadDownAddinfo(
			OsiServicesTrusteeBreadDownAddinfo
				osiServicesTrusteeBreadDownAddinfo);

	/**
	 * Creates a new osi services trustee bread down addinfo with the primary key. Does not add the osi services trustee bread down addinfo to the database.
	 *
	 * @param osiTrusId the primary key for the new osi services trustee bread down addinfo
	 * @return the new osi services trustee bread down addinfo
	 */
	@Transactional(enabled = false)
	public OsiServicesTrusteeBreadDownAddinfo
		createOsiServicesTrusteeBreadDownAddinfo(long osiTrusId);

	/**
	 * @throws PortalException
	 */
	public PersistedModel createPersistedModel(Serializable primaryKeyObj)
		throws PortalException;

	/**
	 * Deletes the osi services trustee bread down addinfo with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiServicesTrusteeBreadDownAddinfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiTrusId the primary key of the osi services trustee bread down addinfo
	 * @return the osi services trustee bread down addinfo that was removed
	 * @throws PortalException if a osi services trustee bread down addinfo with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	public OsiServicesTrusteeBreadDownAddinfo
			deleteOsiServicesTrusteeBreadDownAddinfo(long osiTrusId)
		throws PortalException;

	/**
	 * Deletes the osi services trustee bread down addinfo from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiServicesTrusteeBreadDownAddinfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiServicesTrusteeBreadDownAddinfo the osi services trustee bread down addinfo
	 * @return the osi services trustee bread down addinfo that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	public OsiServicesTrusteeBreadDownAddinfo
		deleteOsiServicesTrusteeBreadDownAddinfo(
			OsiServicesTrusteeBreadDownAddinfo
				osiServicesTrusteeBreadDownAddinfo);

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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.services.application.form.service.model.impl.OsiServicesTrusteeBreadDownAddinfoModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.services.application.form.service.model.impl.OsiServicesTrusteeBreadDownAddinfoModelImpl</code>.
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
	public OsiServicesTrusteeBreadDownAddinfo
		fetchOsiServicesTrusteeBreadDownAddinfo(long osiTrusId);

	/**
	 * Returns the osi services trustee bread down addinfo matching the UUID and group.
	 *
	 * @param uuid the osi services trustee bread down addinfo's UUID
	 * @param groupId the primary key of the group
	 * @return the matching osi services trustee bread down addinfo, or <code>null</code> if a matching osi services trustee bread down addinfo could not be found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public OsiServicesTrusteeBreadDownAddinfo
		fetchOsiServicesTrusteeBreadDownAddinfoByUuidAndGroupId(
			String uuid, long groupId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ActionableDynamicQuery getActionableDynamicQuery();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<OsiServicesTrusteeBreadDownAddinfo> getBreakDownAdd_By_Id(
		long osiId);

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

	/**
	 * Returns the osi services trustee bread down addinfo with the primary key.
	 *
	 * @param osiTrusId the primary key of the osi services trustee bread down addinfo
	 * @return the osi services trustee bread down addinfo
	 * @throws PortalException if a osi services trustee bread down addinfo with the primary key could not be found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public OsiServicesTrusteeBreadDownAddinfo
			getOsiServicesTrusteeBreadDownAddinfo(long osiTrusId)
		throws PortalException;

	/**
	 * Returns the osi services trustee bread down addinfo matching the UUID and group.
	 *
	 * @param uuid the osi services trustee bread down addinfo's UUID
	 * @param groupId the primary key of the group
	 * @return the matching osi services trustee bread down addinfo
	 * @throws PortalException if a matching osi services trustee bread down addinfo could not be found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public OsiServicesTrusteeBreadDownAddinfo
			getOsiServicesTrusteeBreadDownAddinfoByUuidAndGroupId(
				String uuid, long groupId)
		throws PortalException;

	/**
	 * Returns a range of all the osi services trustee bread down addinfos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.services.application.form.service.model.impl.OsiServicesTrusteeBreadDownAddinfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi services trustee bread down addinfos
	 * @param end the upper bound of the range of osi services trustee bread down addinfos (not inclusive)
	 * @return the range of osi services trustee bread down addinfos
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<OsiServicesTrusteeBreadDownAddinfo>
		getOsiServicesTrusteeBreadDownAddinfos(int start, int end);

	/**
	 * Returns all the osi services trustee bread down addinfos matching the UUID and company.
	 *
	 * @param uuid the UUID of the osi services trustee bread down addinfos
	 * @param companyId the primary key of the company
	 * @return the matching osi services trustee bread down addinfos, or an empty list if no matches were found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<OsiServicesTrusteeBreadDownAddinfo>
		getOsiServicesTrusteeBreadDownAddinfosByUuidAndCompanyId(
			String uuid, long companyId);

	/**
	 * Returns a range of osi services trustee bread down addinfos matching the UUID and company.
	 *
	 * @param uuid the UUID of the osi services trustee bread down addinfos
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of osi services trustee bread down addinfos
	 * @param end the upper bound of the range of osi services trustee bread down addinfos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching osi services trustee bread down addinfos, or an empty list if no matches were found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<OsiServicesTrusteeBreadDownAddinfo>
		getOsiServicesTrusteeBreadDownAddinfosByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			OrderByComparator<OsiServicesTrusteeBreadDownAddinfo>
				orderByComparator);

	/**
	 * Returns the number of osi services trustee bread down addinfos.
	 *
	 * @return the number of osi services trustee bread down addinfos
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getOsiServicesTrusteeBreadDownAddinfosCount();

	/**
	 * @throws PortalException
	 */
	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException;

	/**
	 * Updates the osi services trustee bread down addinfo in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiServicesTrusteeBreadDownAddinfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiServicesTrusteeBreadDownAddinfo the osi services trustee bread down addinfo
	 * @return the osi services trustee bread down addinfo that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	public OsiServicesTrusteeBreadDownAddinfo
		updateOsiServicesTrusteeBreadDownAddinfo(
			OsiServicesTrusteeBreadDownAddinfo
				osiServicesTrusteeBreadDownAddinfo);

}