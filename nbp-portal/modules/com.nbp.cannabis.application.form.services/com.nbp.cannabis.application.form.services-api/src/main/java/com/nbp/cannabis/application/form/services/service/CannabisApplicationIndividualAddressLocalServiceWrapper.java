/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.cannabis.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link CannabisApplicationIndividualAddressLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see CannabisApplicationIndividualAddressLocalService
 * @generated
 */
public class CannabisApplicationIndividualAddressLocalServiceWrapper
	implements CannabisApplicationIndividualAddressLocalService,
			   ServiceWrapper
				   <CannabisApplicationIndividualAddressLocalService> {

	public CannabisApplicationIndividualAddressLocalServiceWrapper() {
		this(null);
	}

	public CannabisApplicationIndividualAddressLocalServiceWrapper(
		CannabisApplicationIndividualAddressLocalService
			cannabisApplicationIndividualAddressLocalService) {

		_cannabisApplicationIndividualAddressLocalService =
			cannabisApplicationIndividualAddressLocalService;
	}

	/**
	 * Adds the cannabis application individual address to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisApplicationIndividualAddressLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisApplicationIndividualAddress the cannabis application individual address
	 * @return the cannabis application individual address that was added
	 */
	@Override
	public com.nbp.cannabis.application.form.services.model.
		CannabisApplicationIndividualAddress
			addCannabisApplicationIndividualAddress(
				com.nbp.cannabis.application.form.services.model.
					CannabisApplicationIndividualAddress
						cannabisApplicationIndividualAddress) {

		return _cannabisApplicationIndividualAddressLocalService.
			addCannabisApplicationIndividualAddress(
				cannabisApplicationIndividualAddress);
	}

	/**
	 * Creates a new cannabis application individual address with the primary key. Does not add the cannabis application individual address to the database.
	 *
	 * @param IndividualAddressId the primary key for the new cannabis application individual address
	 * @return the new cannabis application individual address
	 */
	@Override
	public com.nbp.cannabis.application.form.services.model.
		CannabisApplicationIndividualAddress
			createCannabisApplicationIndividualAddress(
				long IndividualAddressId) {

		return _cannabisApplicationIndividualAddressLocalService.
			createCannabisApplicationIndividualAddress(IndividualAddressId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _cannabisApplicationIndividualAddressLocalService.
			createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the cannabis application individual address from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisApplicationIndividualAddressLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisApplicationIndividualAddress the cannabis application individual address
	 * @return the cannabis application individual address that was removed
	 */
	@Override
	public com.nbp.cannabis.application.form.services.model.
		CannabisApplicationIndividualAddress
			deleteCannabisApplicationIndividualAddress(
				com.nbp.cannabis.application.form.services.model.
					CannabisApplicationIndividualAddress
						cannabisApplicationIndividualAddress) {

		return _cannabisApplicationIndividualAddressLocalService.
			deleteCannabisApplicationIndividualAddress(
				cannabisApplicationIndividualAddress);
	}

	/**
	 * Deletes the cannabis application individual address with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisApplicationIndividualAddressLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param IndividualAddressId the primary key of the cannabis application individual address
	 * @return the cannabis application individual address that was removed
	 * @throws PortalException if a cannabis application individual address with the primary key could not be found
	 */
	@Override
	public com.nbp.cannabis.application.form.services.model.
		CannabisApplicationIndividualAddress
				deleteCannabisApplicationIndividualAddress(
					long IndividualAddressId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _cannabisApplicationIndividualAddressLocalService.
			deleteCannabisApplicationIndividualAddress(IndividualAddressId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _cannabisApplicationIndividualAddressLocalService.
			deletePersistedModel(persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _cannabisApplicationIndividualAddressLocalService.dslQuery(
			dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _cannabisApplicationIndividualAddressLocalService.dslQueryCount(
			dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _cannabisApplicationIndividualAddressLocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _cannabisApplicationIndividualAddressLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.cannabis.application.form.services.model.impl.CannabisApplicationIndividualAddressModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _cannabisApplicationIndividualAddressLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.cannabis.application.form.services.model.impl.CannabisApplicationIndividualAddressModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _cannabisApplicationIndividualAddressLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _cannabisApplicationIndividualAddressLocalService.
			dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _cannabisApplicationIndividualAddressLocalService.
			dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.nbp.cannabis.application.form.services.model.
		CannabisApplicationIndividualAddress
			fetchCannabisApplicationIndividualAddress(
				long IndividualAddressId) {

		return _cannabisApplicationIndividualAddressLocalService.
			fetchCannabisApplicationIndividualAddress(IndividualAddressId);
	}

	/**
	 * Returns the cannabis application individual address matching the UUID and group.
	 *
	 * @param uuid the cannabis application individual address's UUID
	 * @param groupId the primary key of the group
	 * @return the matching cannabis application individual address, or <code>null</code> if a matching cannabis application individual address could not be found
	 */
	@Override
	public com.nbp.cannabis.application.form.services.model.
		CannabisApplicationIndividualAddress
			fetchCannabisApplicationIndividualAddressByUuidAndGroupId(
				String uuid, long groupId) {

		return _cannabisApplicationIndividualAddressLocalService.
			fetchCannabisApplicationIndividualAddressByUuidAndGroupId(
				uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _cannabisApplicationIndividualAddressLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.nbp.cannabis.application.form.services.model.
		CannabisApplicationIndividualAddress getCA_CA_by_CI_AT(
			String addressType, long companyInformationId) {

		return _cannabisApplicationIndividualAddressLocalService.
			getCA_CA_by_CI_AT(addressType, companyInformationId);
	}

	/**
	 * Returns the cannabis application individual address with the primary key.
	 *
	 * @param IndividualAddressId the primary key of the cannabis application individual address
	 * @return the cannabis application individual address
	 * @throws PortalException if a cannabis application individual address with the primary key could not be found
	 */
	@Override
	public com.nbp.cannabis.application.form.services.model.
		CannabisApplicationIndividualAddress
				getCannabisApplicationIndividualAddress(
					long IndividualAddressId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _cannabisApplicationIndividualAddressLocalService.
			getCannabisApplicationIndividualAddress(IndividualAddressId);
	}

	/**
	 * Returns the cannabis application individual address matching the UUID and group.
	 *
	 * @param uuid the cannabis application individual address's UUID
	 * @param groupId the primary key of the group
	 * @return the matching cannabis application individual address
	 * @throws PortalException if a matching cannabis application individual address could not be found
	 */
	@Override
	public com.nbp.cannabis.application.form.services.model.
		CannabisApplicationIndividualAddress
				getCannabisApplicationIndividualAddressByUuidAndGroupId(
					String uuid, long groupId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _cannabisApplicationIndividualAddressLocalService.
			getCannabisApplicationIndividualAddressByUuidAndGroupId(
				uuid, groupId);
	}

	/**
	 * Returns a range of all the cannabis application individual addresses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.cannabis.application.form.services.model.impl.CannabisApplicationIndividualAddressModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis application individual addresses
	 * @param end the upper bound of the range of cannabis application individual addresses (not inclusive)
	 * @return the range of cannabis application individual addresses
	 */
	@Override
	public java.util.List
		<com.nbp.cannabis.application.form.services.model.
			CannabisApplicationIndividualAddress>
				getCannabisApplicationIndividualAddresses(int start, int end) {

		return _cannabisApplicationIndividualAddressLocalService.
			getCannabisApplicationIndividualAddresses(start, end);
	}

	/**
	 * Returns all the cannabis application individual addresses matching the UUID and company.
	 *
	 * @param uuid the UUID of the cannabis application individual addresses
	 * @param companyId the primary key of the company
	 * @return the matching cannabis application individual addresses, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.cannabis.application.form.services.model.
			CannabisApplicationIndividualAddress>
				getCannabisApplicationIndividualAddressesByUuidAndCompanyId(
					String uuid, long companyId) {

		return _cannabisApplicationIndividualAddressLocalService.
			getCannabisApplicationIndividualAddressesByUuidAndCompanyId(
				uuid, companyId);
	}

	/**
	 * Returns a range of cannabis application individual addresses matching the UUID and company.
	 *
	 * @param uuid the UUID of the cannabis application individual addresses
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of cannabis application individual addresses
	 * @param end the upper bound of the range of cannabis application individual addresses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching cannabis application individual addresses, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.cannabis.application.form.services.model.
			CannabisApplicationIndividualAddress>
				getCannabisApplicationIndividualAddressesByUuidAndCompanyId(
					String uuid, long companyId, int start, int end,
					com.liferay.portal.kernel.util.OrderByComparator
						<com.nbp.cannabis.application.form.services.model.
							CannabisApplicationIndividualAddress>
								orderByComparator) {

		return _cannabisApplicationIndividualAddressLocalService.
			getCannabisApplicationIndividualAddressesByUuidAndCompanyId(
				uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of cannabis application individual addresses.
	 *
	 * @return the number of cannabis application individual addresses
	 */
	@Override
	public int getCannabisApplicationIndividualAddressesCount() {
		return _cannabisApplicationIndividualAddressLocalService.
			getCannabisApplicationIndividualAddressesCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _cannabisApplicationIndividualAddressLocalService.
			getExportActionableDynamicQuery(portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _cannabisApplicationIndividualAddressLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _cannabisApplicationIndividualAddressLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _cannabisApplicationIndividualAddressLocalService.
			getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the cannabis application individual address in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisApplicationIndividualAddressLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisApplicationIndividualAddress the cannabis application individual address
	 * @return the cannabis application individual address that was updated
	 */
	@Override
	public com.nbp.cannabis.application.form.services.model.
		CannabisApplicationIndividualAddress
			updateCannabisApplicationIndividualAddress(
				com.nbp.cannabis.application.form.services.model.
					CannabisApplicationIndividualAddress
						cannabisApplicationIndividualAddress) {

		return _cannabisApplicationIndividualAddressLocalService.
			updateCannabisApplicationIndividualAddress(
				cannabisApplicationIndividualAddress);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _cannabisApplicationIndividualAddressLocalService.
			getBasePersistence();
	}

	@Override
	public CannabisApplicationIndividualAddressLocalService
		getWrappedService() {

		return _cannabisApplicationIndividualAddressLocalService;
	}

	@Override
	public void setWrappedService(
		CannabisApplicationIndividualAddressLocalService
			cannabisApplicationIndividualAddressLocalService) {

		_cannabisApplicationIndividualAddressLocalService =
			cannabisApplicationIndividualAddressLocalService;
	}

	private CannabisApplicationIndividualAddressLocalService
		_cannabisApplicationIndividualAddressLocalService;

}