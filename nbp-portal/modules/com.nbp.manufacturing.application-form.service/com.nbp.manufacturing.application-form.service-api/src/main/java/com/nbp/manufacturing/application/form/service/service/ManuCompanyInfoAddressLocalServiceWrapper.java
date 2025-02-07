/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.manufacturing.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link ManuCompanyInfoAddressLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see ManuCompanyInfoAddressLocalService
 * @generated
 */
public class ManuCompanyInfoAddressLocalServiceWrapper
	implements ManuCompanyInfoAddressLocalService,
			   ServiceWrapper<ManuCompanyInfoAddressLocalService> {

	public ManuCompanyInfoAddressLocalServiceWrapper() {
		this(null);
	}

	public ManuCompanyInfoAddressLocalServiceWrapper(
		ManuCompanyInfoAddressLocalService manuCompanyInfoAddressLocalService) {

		_manuCompanyInfoAddressLocalService =
			manuCompanyInfoAddressLocalService;
	}

	/**
	 * Adds the manu company info address to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ManuCompanyInfoAddressLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param manuCompanyInfoAddress the manu company info address
	 * @return the manu company info address that was added
	 */
	@Override
	public
		com.nbp.manufacturing.application.form.service.model.
			ManuCompanyInfoAddress addManuCompanyInfoAddress(
				com.nbp.manufacturing.application.form.service.model.
					ManuCompanyInfoAddress manuCompanyInfoAddress) {

		return _manuCompanyInfoAddressLocalService.addManuCompanyInfoAddress(
			manuCompanyInfoAddress);
	}

	/**
	 * Creates a new manu company info address with the primary key. Does not add the manu company info address to the database.
	 *
	 * @param manuCompanyInfoAddressId the primary key for the new manu company info address
	 * @return the new manu company info address
	 */
	@Override
	public
		com.nbp.manufacturing.application.form.service.model.
			ManuCompanyInfoAddress createManuCompanyInfoAddress(
				long manuCompanyInfoAddressId) {

		return _manuCompanyInfoAddressLocalService.createManuCompanyInfoAddress(
			manuCompanyInfoAddressId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _manuCompanyInfoAddressLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the manu company info address with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ManuCompanyInfoAddressLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param manuCompanyInfoAddressId the primary key of the manu company info address
	 * @return the manu company info address that was removed
	 * @throws PortalException if a manu company info address with the primary key could not be found
	 */
	@Override
	public
		com.nbp.manufacturing.application.form.service.model.
			ManuCompanyInfoAddress deleteManuCompanyInfoAddress(
					long manuCompanyInfoAddressId)
				throws com.liferay.portal.kernel.exception.PortalException {

		return _manuCompanyInfoAddressLocalService.deleteManuCompanyInfoAddress(
			manuCompanyInfoAddressId);
	}

	/**
	 * Deletes the manu company info address from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ManuCompanyInfoAddressLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param manuCompanyInfoAddress the manu company info address
	 * @return the manu company info address that was removed
	 */
	@Override
	public
		com.nbp.manufacturing.application.form.service.model.
			ManuCompanyInfoAddress deleteManuCompanyInfoAddress(
				com.nbp.manufacturing.application.form.service.model.
					ManuCompanyInfoAddress manuCompanyInfoAddress) {

		return _manuCompanyInfoAddressLocalService.deleteManuCompanyInfoAddress(
			manuCompanyInfoAddress);
	}

	@Override
	public void deleteMultipleFormById(long applicationId) {
		_manuCompanyInfoAddressLocalService.deleteMultipleFormById(
			applicationId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _manuCompanyInfoAddressLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _manuCompanyInfoAddressLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _manuCompanyInfoAddressLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _manuCompanyInfoAddressLocalService.dynamicQuery();
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

		return _manuCompanyInfoAddressLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.manufacturing.application.form.service.model.impl.ManuCompanyInfoAddressModelImpl</code>.
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

		return _manuCompanyInfoAddressLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.manufacturing.application.form.service.model.impl.ManuCompanyInfoAddressModelImpl</code>.
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

		return _manuCompanyInfoAddressLocalService.dynamicQuery(
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

		return _manuCompanyInfoAddressLocalService.dynamicQueryCount(
			dynamicQuery);
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

		return _manuCompanyInfoAddressLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public
		com.nbp.manufacturing.application.form.service.model.
			ManuCompanyInfoAddress fetchManuCompanyInfoAddress(
				long manuCompanyInfoAddressId) {

		return _manuCompanyInfoAddressLocalService.fetchManuCompanyInfoAddress(
			manuCompanyInfoAddressId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _manuCompanyInfoAddressLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _manuCompanyInfoAddressLocalService.
			getIndexableActionableDynamicQuery();
	}

	@Override
	public java.util.List
		<com.nbp.manufacturing.application.form.service.model.
			ManuCompanyInfoAddress> getMA_CIA(long manufacturingApplicationId) {

		return _manuCompanyInfoAddressLocalService.getMA_CIA(
			manufacturingApplicationId);
	}

	@Override
	public java.util.List
		<com.nbp.manufacturing.application.form.service.model.
			ManuCompanyInfoAddress> getMA_CII(long manuCompanyInfoId) {

		return _manuCompanyInfoAddressLocalService.getMA_CII(manuCompanyInfoId);
	}

	/**
	 * Returns the manu company info address with the primary key.
	 *
	 * @param manuCompanyInfoAddressId the primary key of the manu company info address
	 * @return the manu company info address
	 * @throws PortalException if a manu company info address with the primary key could not be found
	 */
	@Override
	public
		com.nbp.manufacturing.application.form.service.model.
			ManuCompanyInfoAddress getManuCompanyInfoAddress(
					long manuCompanyInfoAddressId)
				throws com.liferay.portal.kernel.exception.PortalException {

		return _manuCompanyInfoAddressLocalService.getManuCompanyInfoAddress(
			manuCompanyInfoAddressId);
	}

	/**
	 * Returns a range of all the manu company info addresses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.manufacturing.application.form.service.model.impl.ManuCompanyInfoAddressModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of manu company info addresses
	 * @param end the upper bound of the range of manu company info addresses (not inclusive)
	 * @return the range of manu company info addresses
	 */
	@Override
	public java.util.List
		<com.nbp.manufacturing.application.form.service.model.
			ManuCompanyInfoAddress> getManuCompanyInfoAddresses(
				int start, int end) {

		return _manuCompanyInfoAddressLocalService.getManuCompanyInfoAddresses(
			start, end);
	}

	/**
	 * Returns the number of manu company info addresses.
	 *
	 * @return the number of manu company info addresses
	 */
	@Override
	public int getManuCompanyInfoAddressesCount() {
		return _manuCompanyInfoAddressLocalService.
			getManuCompanyInfoAddressesCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _manuCompanyInfoAddressLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _manuCompanyInfoAddressLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the manu company info address in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ManuCompanyInfoAddressLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param manuCompanyInfoAddress the manu company info address
	 * @return the manu company info address that was updated
	 */
	@Override
	public
		com.nbp.manufacturing.application.form.service.model.
			ManuCompanyInfoAddress updateManuCompanyInfoAddress(
				com.nbp.manufacturing.application.form.service.model.
					ManuCompanyInfoAddress manuCompanyInfoAddress) {

		return _manuCompanyInfoAddressLocalService.updateManuCompanyInfoAddress(
			manuCompanyInfoAddress);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _manuCompanyInfoAddressLocalService.getBasePersistence();
	}

	@Override
	public ManuCompanyInfoAddressLocalService getWrappedService() {
		return _manuCompanyInfoAddressLocalService;
	}

	@Override
	public void setWrappedService(
		ManuCompanyInfoAddressLocalService manuCompanyInfoAddressLocalService) {

		_manuCompanyInfoAddressLocalService =
			manuCompanyInfoAddressLocalService;
	}

	private ManuCompanyInfoAddressLocalService
		_manuCompanyInfoAddressLocalService;

}