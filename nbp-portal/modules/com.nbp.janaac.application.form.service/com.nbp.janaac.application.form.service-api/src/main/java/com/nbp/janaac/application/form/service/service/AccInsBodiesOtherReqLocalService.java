/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service;

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

import com.nbp.janaac.application.form.service.exception.NoSuchAccInsBodiesOtherReqException;
import com.nbp.janaac.application.form.service.model.AccInsBodiesOtherReq;

import java.io.Serializable;

import java.util.List;

import org.osgi.annotation.versioning.ProviderType;

/**
 * Provides the local service interface for AccInsBodiesOtherReq. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author Brian Wing Shun Chan
 * @see AccInsBodiesOtherReqLocalServiceUtil
 * @generated
 */
@ProviderType
@Transactional(
	isolation = Isolation.PORTAL,
	rollbackFor = {PortalException.class, SystemException.class}
)
public interface AccInsBodiesOtherReqLocalService
	extends BaseLocalService, PersistedModelLocalService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add custom service methods to <code>com.nbp.janaac.application.form.service.service.impl.AccInsBodiesOtherReqLocalServiceImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface. Consume the acc ins bodies other req local service via injection or a <code>org.osgi.util.tracker.ServiceTracker</code>. Use {@link AccInsBodiesOtherReqLocalServiceUtil} if injection and service tracking are not available.
	 */

	/**
	 * Adds the acc ins bodies other req to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AccInsBodiesOtherReqLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param accInsBodiesOtherReq the acc ins bodies other req
	 * @return the acc ins bodies other req that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	public AccInsBodiesOtherReq addAccInsBodiesOtherReq(
		AccInsBodiesOtherReq accInsBodiesOtherReq);

	/**
	 * Creates a new acc ins bodies other req with the primary key. Does not add the acc ins bodies other req to the database.
	 *
	 * @param accInsBodiesOtherReqId the primary key for the new acc ins bodies other req
	 * @return the new acc ins bodies other req
	 */
	@Transactional(enabled = false)
	public AccInsBodiesOtherReq createAccInsBodiesOtherReq(
		long accInsBodiesOtherReqId);

	/**
	 * @throws PortalException
	 */
	public PersistedModel createPersistedModel(Serializable primaryKeyObj)
		throws PortalException;

	/**
	 * Deletes the acc ins bodies other req from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AccInsBodiesOtherReqLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param accInsBodiesOtherReq the acc ins bodies other req
	 * @return the acc ins bodies other req that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	public AccInsBodiesOtherReq deleteAccInsBodiesOtherReq(
		AccInsBodiesOtherReq accInsBodiesOtherReq);

	/**
	 * Deletes the acc ins bodies other req with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AccInsBodiesOtherReqLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param accInsBodiesOtherReqId the primary key of the acc ins bodies other req
	 * @return the acc ins bodies other req that was removed
	 * @throws PortalException if a acc ins bodies other req with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	public AccInsBodiesOtherReq deleteAccInsBodiesOtherReq(
			long accInsBodiesOtherReqId)
		throws PortalException;

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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AccInsBodiesOtherReqModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AccInsBodiesOtherReqModelImpl</code>.
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
	public AccInsBodiesOtherReq fetchAccInsBodiesOtherReq(
		long accInsBodiesOtherReqId);

	/**
	 * Returns the acc ins bodies other req matching the UUID and group.
	 *
	 * @param uuid the acc ins bodies other req's UUID
	 * @param groupId the primary key of the group
	 * @return the matching acc ins bodies other req, or <code>null</code> if a matching acc ins bodies other req could not be found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public AccInsBodiesOtherReq fetchAccInsBodiesOtherReqByUuidAndGroupId(
		String uuid, long groupId);

	/**
	 * Returns the acc ins bodies other req with the primary key.
	 *
	 * @param accInsBodiesOtherReqId the primary key of the acc ins bodies other req
	 * @return the acc ins bodies other req
	 * @throws PortalException if a acc ins bodies other req with the primary key could not be found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public AccInsBodiesOtherReq getAccInsBodiesOtherReq(
			long accInsBodiesOtherReqId)
		throws PortalException;

	/**
	 * Returns the acc ins bodies other req matching the UUID and group.
	 *
	 * @param uuid the acc ins bodies other req's UUID
	 * @param groupId the primary key of the group
	 * @return the matching acc ins bodies other req
	 * @throws PortalException if a matching acc ins bodies other req could not be found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public AccInsBodiesOtherReq getAccInsBodiesOtherReqByUuidAndGroupId(
			String uuid, long groupId)
		throws PortalException;

	/**
	 * Returns a range of all the acc ins bodies other reqs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AccInsBodiesOtherReqModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acc ins bodies other reqs
	 * @param end the upper bound of the range of acc ins bodies other reqs (not inclusive)
	 * @return the range of acc ins bodies other reqs
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<AccInsBodiesOtherReq> getAccInsBodiesOtherReqs(
		int start, int end);

	/**
	 * Returns all the acc ins bodies other reqs matching the UUID and company.
	 *
	 * @param uuid the UUID of the acc ins bodies other reqs
	 * @param companyId the primary key of the company
	 * @return the matching acc ins bodies other reqs, or an empty list if no matches were found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<AccInsBodiesOtherReq>
		getAccInsBodiesOtherReqsByUuidAndCompanyId(String uuid, long companyId);

	/**
	 * Returns a range of acc ins bodies other reqs matching the UUID and company.
	 *
	 * @param uuid the UUID of the acc ins bodies other reqs
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of acc ins bodies other reqs
	 * @param end the upper bound of the range of acc ins bodies other reqs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching acc ins bodies other reqs, or an empty list if no matches were found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<AccInsBodiesOtherReq>
		getAccInsBodiesOtherReqsByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			OrderByComparator<AccInsBodiesOtherReq> orderByComparator);

	/**
	 * Returns the number of acc ins bodies other reqs.
	 *
	 * @return the number of acc ins bodies other reqs
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getAccInsBodiesOtherReqsCount();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ActionableDynamicQuery getActionableDynamicQuery();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ExportActionableDynamicQuery getExportActionableDynamicQuery(
		PortletDataContext portletDataContext);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public IndexableActionableDynamicQuery getIndexableActionableDynamicQuery();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public AccInsBodiesOtherReq getJANAAC_ByApplicationId(
			long janaacApplicationId)
		throws NoSuchAccInsBodiesOtherReqException;

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
	 * Updates the acc ins bodies other req in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AccInsBodiesOtherReqLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param accInsBodiesOtherReq the acc ins bodies other req
	 * @return the acc ins bodies other req that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	public AccInsBodiesOtherReq updateAccInsBodiesOtherReq(
		AccInsBodiesOtherReq accInsBodiesOtherReq);

}