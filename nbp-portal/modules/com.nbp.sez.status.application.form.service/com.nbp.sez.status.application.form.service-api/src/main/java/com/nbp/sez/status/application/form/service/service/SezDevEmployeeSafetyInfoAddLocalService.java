/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
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

import com.nbp.sez.status.application.form.service.model.SezDevEmployeeSafetyInfoAdd;

import java.io.Serializable;

import java.util.List;

import org.osgi.annotation.versioning.ProviderType;

/**
 * Provides the local service interface for SezDevEmployeeSafetyInfoAdd. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author Brian Wing Shun Chan
 * @see SezDevEmployeeSafetyInfoAddLocalServiceUtil
 * @generated
 */
@ProviderType
@Transactional(
	isolation = Isolation.PORTAL,
	rollbackFor = {PortalException.class, SystemException.class}
)
public interface SezDevEmployeeSafetyInfoAddLocalService
	extends BaseLocalService, PersistedModelLocalService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add custom service methods to <code>com.nbp.sez.status.application.form.service.service.impl.SezDevEmployeeSafetyInfoAddLocalServiceImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface. Consume the sez dev employee safety info add local service via injection or a <code>org.osgi.util.tracker.ServiceTracker</code>. Use {@link SezDevEmployeeSafetyInfoAddLocalServiceUtil} if injection and service tracking are not available.
	 */

	/**
	 * Adds the sez dev employee safety info add to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezDevEmployeeSafetyInfoAddLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezDevEmployeeSafetyInfoAdd the sez dev employee safety info add
	 * @return the sez dev employee safety info add that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	public SezDevEmployeeSafetyInfoAdd addSezDevEmployeeSafetyInfoAdd(
		SezDevEmployeeSafetyInfoAdd sezDevEmployeeSafetyInfoAdd);

	/**
	 * @throws PortalException
	 */
	public PersistedModel createPersistedModel(Serializable primaryKeyObj)
		throws PortalException;

	/**
	 * Creates a new sez dev employee safety info add with the primary key. Does not add the sez dev employee safety info add to the database.
	 *
	 * @param sezDevEmployeeSafetyInfoAddId the primary key for the new sez dev employee safety info add
	 * @return the new sez dev employee safety info add
	 */
	@Transactional(enabled = false)
	public SezDevEmployeeSafetyInfoAdd createSezDevEmployeeSafetyInfoAdd(
		long sezDevEmployeeSafetyInfoAddId);

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException;

	/**
	 * Deletes the sez dev employee safety info add with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezDevEmployeeSafetyInfoAddLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezDevEmployeeSafetyInfoAddId the primary key of the sez dev employee safety info add
	 * @return the sez dev employee safety info add that was removed
	 * @throws PortalException if a sez dev employee safety info add with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	public SezDevEmployeeSafetyInfoAdd deleteSezDevEmployeeSafetyInfoAdd(
			long sezDevEmployeeSafetyInfoAddId)
		throws PortalException;

	/**
	 * Deletes the sez dev employee safety info add from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezDevEmployeeSafetyInfoAddLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezDevEmployeeSafetyInfoAdd the sez dev employee safety info add
	 * @return the sez dev employee safety info add that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	public SezDevEmployeeSafetyInfoAdd deleteSezDevEmployeeSafetyInfoAdd(
		SezDevEmployeeSafetyInfoAdd sezDevEmployeeSafetyInfoAdd);

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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.form.service.model.impl.SezDevEmployeeSafetyInfoAddModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.form.service.model.impl.SezDevEmployeeSafetyInfoAddModelImpl</code>.
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
	public SezDevEmployeeSafetyInfoAdd fetchSezDevEmployeeSafetyInfoAdd(
		long sezDevEmployeeSafetyInfoAddId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ActionableDynamicQuery getActionableDynamicQuery();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public IndexableActionableDynamicQuery getIndexableActionableDynamicQuery();

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

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<SezDevEmployeeSafetyInfoAdd> getSezById(
		long sezStatusApplicationId);

	/**
	 * Returns the sez dev employee safety info add with the primary key.
	 *
	 * @param sezDevEmployeeSafetyInfoAddId the primary key of the sez dev employee safety info add
	 * @return the sez dev employee safety info add
	 * @throws PortalException if a sez dev employee safety info add with the primary key could not be found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public SezDevEmployeeSafetyInfoAdd getSezDevEmployeeSafetyInfoAdd(
			long sezDevEmployeeSafetyInfoAddId)
		throws PortalException;

	/**
	 * Returns a range of all the sez dev employee safety info adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.form.service.model.impl.SezDevEmployeeSafetyInfoAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez dev employee safety info adds
	 * @param end the upper bound of the range of sez dev employee safety info adds (not inclusive)
	 * @return the range of sez dev employee safety info adds
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<SezDevEmployeeSafetyInfoAdd> getSezDevEmployeeSafetyInfoAdds(
		int start, int end);

	/**
	 * Returns the number of sez dev employee safety info adds.
	 *
	 * @return the number of sez dev employee safety info adds
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getSezDevEmployeeSafetyInfoAddsCount();

	/**
	 * Updates the sez dev employee safety info add in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezDevEmployeeSafetyInfoAddLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezDevEmployeeSafetyInfoAdd the sez dev employee safety info add
	 * @return the sez dev employee safety info add that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	public SezDevEmployeeSafetyInfoAdd updateSezDevEmployeeSafetyInfoAdd(
		SezDevEmployeeSafetyInfoAdd sezDevEmployeeSafetyInfoAdd);

}