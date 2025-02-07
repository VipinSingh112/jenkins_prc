/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.cannabis.application.form.services.service;

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

import com.nbp.cannabis.application.form.services.exception.NoSuchCannabisApplicationCompanyAddressException;
import com.nbp.cannabis.application.form.services.model.CannabisApplicationCompanyAddress;

import java.io.Serializable;

import java.util.List;

import org.osgi.annotation.versioning.ProviderType;

/**
 * Provides the local service interface for CannabisApplicationCompanyAddress. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author Brian Wing Shun Chan
 * @see CannabisApplicationCompanyAddressLocalServiceUtil
 * @generated
 */
@ProviderType
@Transactional(
	isolation = Isolation.PORTAL,
	rollbackFor = {PortalException.class, SystemException.class}
)
public interface CannabisApplicationCompanyAddressLocalService
	extends BaseLocalService, PersistedModelLocalService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add custom service methods to <code>com.nbp.cannabis.application.form.services.service.impl.CannabisApplicationCompanyAddressLocalServiceImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface. Consume the cannabis application company address local service via injection or a <code>org.osgi.util.tracker.ServiceTracker</code>. Use {@link CannabisApplicationCompanyAddressLocalServiceUtil} if injection and service tracking are not available.
	 */

	/**
	 * Adds the cannabis application company address to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisApplicationCompanyAddressLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisApplicationCompanyAddress the cannabis application company address
	 * @return the cannabis application company address that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	public CannabisApplicationCompanyAddress
		addCannabisApplicationCompanyAddress(
			CannabisApplicationCompanyAddress
				cannabisApplicationCompanyAddress);

	/**
	 * Creates a new cannabis application company address with the primary key. Does not add the cannabis application company address to the database.
	 *
	 * @param companyAddressId the primary key for the new cannabis application company address
	 * @return the new cannabis application company address
	 */
	@Transactional(enabled = false)
	public CannabisApplicationCompanyAddress
		createCannabisApplicationCompanyAddress(long companyAddressId);

	/**
	 * @throws PortalException
	 */
	public PersistedModel createPersistedModel(Serializable primaryKeyObj)
		throws PortalException;

	/**
	 * Deletes the cannabis application company address from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisApplicationCompanyAddressLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisApplicationCompanyAddress the cannabis application company address
	 * @return the cannabis application company address that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	public CannabisApplicationCompanyAddress
		deleteCannabisApplicationCompanyAddress(
			CannabisApplicationCompanyAddress
				cannabisApplicationCompanyAddress);

	/**
	 * Deletes the cannabis application company address with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisApplicationCompanyAddressLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param companyAddressId the primary key of the cannabis application company address
	 * @return the cannabis application company address that was removed
	 * @throws PortalException if a cannabis application company address with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	public CannabisApplicationCompanyAddress
			deleteCannabisApplicationCompanyAddress(long companyAddressId)
		throws PortalException;

	public CannabisApplicationCompanyAddress
			deleteCannabisApplicationCompanyAddress(
				String addressType, long companyInformationId)
		throws NoSuchCannabisApplicationCompanyAddressException;

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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.cannabis.application.form.services.model.impl.CannabisApplicationCompanyAddressModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.cannabis.application.form.services.model.impl.CannabisApplicationCompanyAddressModelImpl</code>.
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
	public CannabisApplicationCompanyAddress
		fetchCannabisApplicationCompanyAddress(long companyAddressId);

	/**
	 * Returns the cannabis application company address matching the UUID and group.
	 *
	 * @param uuid the cannabis application company address's UUID
	 * @param groupId the primary key of the group
	 * @return the matching cannabis application company address, or <code>null</code> if a matching cannabis application company address could not be found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public CannabisApplicationCompanyAddress
		fetchCannabisApplicationCompanyAddressByUuidAndGroupId(
			String uuid, long groupId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ActionableDynamicQuery getActionableDynamicQuery();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public CannabisApplicationCompanyAddress getCA_CA_by_CI_AT(
		String addressType, long companyInformationId);

	/**
	 * Returns the cannabis application company address with the primary key.
	 *
	 * @param companyAddressId the primary key of the cannabis application company address
	 * @return the cannabis application company address
	 * @throws PortalException if a cannabis application company address with the primary key could not be found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public CannabisApplicationCompanyAddress
			getCannabisApplicationCompanyAddress(long companyAddressId)
		throws PortalException;

	/**
	 * Returns the cannabis application company address matching the UUID and group.
	 *
	 * @param uuid the cannabis application company address's UUID
	 * @param groupId the primary key of the group
	 * @return the matching cannabis application company address
	 * @throws PortalException if a matching cannabis application company address could not be found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public CannabisApplicationCompanyAddress
			getCannabisApplicationCompanyAddressByUuidAndGroupId(
				String uuid, long groupId)
		throws PortalException;

	/**
	 * Returns a range of all the cannabis application company addresses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.cannabis.application.form.services.model.impl.CannabisApplicationCompanyAddressModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis application company addresses
	 * @param end the upper bound of the range of cannabis application company addresses (not inclusive)
	 * @return the range of cannabis application company addresses
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<CannabisApplicationCompanyAddress>
		getCannabisApplicationCompanyAddresses(int start, int end);

	/**
	 * Returns all the cannabis application company addresses matching the UUID and company.
	 *
	 * @param uuid the UUID of the cannabis application company addresses
	 * @param companyId the primary key of the company
	 * @return the matching cannabis application company addresses, or an empty list if no matches were found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<CannabisApplicationCompanyAddress>
		getCannabisApplicationCompanyAddressesByUuidAndCompanyId(
			String uuid, long companyId);

	/**
	 * Returns a range of cannabis application company addresses matching the UUID and company.
	 *
	 * @param uuid the UUID of the cannabis application company addresses
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of cannabis application company addresses
	 * @param end the upper bound of the range of cannabis application company addresses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching cannabis application company addresses, or an empty list if no matches were found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<CannabisApplicationCompanyAddress>
		getCannabisApplicationCompanyAddressesByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			OrderByComparator<CannabisApplicationCompanyAddress>
				orderByComparator);

	/**
	 * Returns the number of cannabis application company addresses.
	 *
	 * @return the number of cannabis application company addresses
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getCannabisApplicationCompanyAddressesCount();

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
	 * @throws PortalException
	 */
	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException;

	/**
	 * Updates the cannabis application company address in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisApplicationCompanyAddressLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisApplicationCompanyAddress the cannabis application company address
	 * @return the cannabis application company address that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	public CannabisApplicationCompanyAddress
		updateCannabisApplicationCompanyAddress(
			CannabisApplicationCompanyAddress
				cannabisApplicationCompanyAddress);

}