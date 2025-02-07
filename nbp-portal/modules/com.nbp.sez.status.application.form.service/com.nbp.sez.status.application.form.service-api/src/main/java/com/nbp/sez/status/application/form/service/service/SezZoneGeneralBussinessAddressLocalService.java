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

import com.nbp.sez.status.application.form.service.exception.NoSuchSezZoneGeneralBussinessAddressException;
import com.nbp.sez.status.application.form.service.model.SezZoneGeneralBussinessAddress;

import java.io.Serializable;

import java.util.List;

import org.osgi.annotation.versioning.ProviderType;

/**
 * Provides the local service interface for SezZoneGeneralBussinessAddress. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author Brian Wing Shun Chan
 * @see SezZoneGeneralBussinessAddressLocalServiceUtil
 * @generated
 */
@ProviderType
@Transactional(
	isolation = Isolation.PORTAL,
	rollbackFor = {PortalException.class, SystemException.class}
)
public interface SezZoneGeneralBussinessAddressLocalService
	extends BaseLocalService, PersistedModelLocalService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add custom service methods to <code>com.nbp.sez.status.application.form.service.service.impl.SezZoneGeneralBussinessAddressLocalServiceImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface. Consume the sez zone general bussiness address local service via injection or a <code>org.osgi.util.tracker.ServiceTracker</code>. Use {@link SezZoneGeneralBussinessAddressLocalServiceUtil} if injection and service tracking are not available.
	 */

	/**
	 * Adds the sez zone general bussiness address to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezZoneGeneralBussinessAddressLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezZoneGeneralBussinessAddress the sez zone general bussiness address
	 * @return the sez zone general bussiness address that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	public SezZoneGeneralBussinessAddress addSezZoneGeneralBussinessAddress(
		SezZoneGeneralBussinessAddress sezZoneGeneralBussinessAddress);

	/**
	 * @throws PortalException
	 */
	public PersistedModel createPersistedModel(Serializable primaryKeyObj)
		throws PortalException;

	/**
	 * Creates a new sez zone general bussiness address with the primary key. Does not add the sez zone general bussiness address to the database.
	 *
	 * @param sezZoneGenBussAddressId the primary key for the new sez zone general bussiness address
	 * @return the new sez zone general bussiness address
	 */
	@Transactional(enabled = false)
	public SezZoneGeneralBussinessAddress createSezZoneGeneralBussinessAddress(
		long sezZoneGenBussAddressId);

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException;

	/**
	 * Deletes the sez zone general bussiness address with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezZoneGeneralBussinessAddressLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezZoneGenBussAddressId the primary key of the sez zone general bussiness address
	 * @return the sez zone general bussiness address that was removed
	 * @throws PortalException if a sez zone general bussiness address with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	public SezZoneGeneralBussinessAddress deleteSezZoneGeneralBussinessAddress(
			long sezZoneGenBussAddressId)
		throws PortalException;

	/**
	 * Deletes the sez zone general bussiness address from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezZoneGeneralBussinessAddressLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezZoneGeneralBussinessAddress the sez zone general bussiness address
	 * @return the sez zone general bussiness address that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	public SezZoneGeneralBussinessAddress deleteSezZoneGeneralBussinessAddress(
		SezZoneGeneralBussinessAddress sezZoneGeneralBussinessAddress);

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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.form.service.model.impl.SezZoneGeneralBussinessAddressModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.form.service.model.impl.SezZoneGeneralBussinessAddressModelImpl</code>.
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
	public SezZoneGeneralBussinessAddress fetchSezZoneGeneralBussinessAddress(
		long sezZoneGenBussAddressId);

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
	public SezZoneGeneralBussinessAddress getSezStatusBy_AT_GBI(
			long generalBussinessId, String addressType)
		throws NoSuchSezZoneGeneralBussinessAddressException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public SezZoneGeneralBussinessAddress getSezStatusBy_AT_SAI(
			long sezApplicationId, String addressType)
		throws NoSuchSezZoneGeneralBussinessAddressException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public SezZoneGeneralBussinessAddress getSezStatusBy_Id(
			long sezApplicationId)
		throws NoSuchSezZoneGeneralBussinessAddressException;

	/**
	 * Returns the sez zone general bussiness address with the primary key.
	 *
	 * @param sezZoneGenBussAddressId the primary key of the sez zone general bussiness address
	 * @return the sez zone general bussiness address
	 * @throws PortalException if a sez zone general bussiness address with the primary key could not be found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public SezZoneGeneralBussinessAddress getSezZoneGeneralBussinessAddress(
			long sezZoneGenBussAddressId)
		throws PortalException;

	/**
	 * Returns a range of all the sez zone general bussiness addresses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.form.service.model.impl.SezZoneGeneralBussinessAddressModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez zone general bussiness addresses
	 * @param end the upper bound of the range of sez zone general bussiness addresses (not inclusive)
	 * @return the range of sez zone general bussiness addresses
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<SezZoneGeneralBussinessAddress>
		getSezZoneGeneralBussinessAddresses(int start, int end);

	/**
	 * Returns the number of sez zone general bussiness addresses.
	 *
	 * @return the number of sez zone general bussiness addresses
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getSezZoneGeneralBussinessAddressesCount();

	/**
	 * Updates the sez zone general bussiness address in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezZoneGeneralBussinessAddressLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezZoneGeneralBussinessAddress the sez zone general bussiness address
	 * @return the sez zone general bussiness address that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	public SezZoneGeneralBussinessAddress updateSezZoneGeneralBussinessAddress(
		SezZoneGeneralBussinessAddress sezZoneGeneralBussinessAddress);

}