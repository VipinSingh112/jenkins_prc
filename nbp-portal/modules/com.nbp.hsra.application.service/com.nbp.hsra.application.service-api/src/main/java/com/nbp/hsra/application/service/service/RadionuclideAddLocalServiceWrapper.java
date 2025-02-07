/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link RadionuclideAddLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see RadionuclideAddLocalService
 * @generated
 */
public class RadionuclideAddLocalServiceWrapper
	implements RadionuclideAddLocalService,
			   ServiceWrapper<RadionuclideAddLocalService> {

	public RadionuclideAddLocalServiceWrapper() {
		this(null);
	}

	public RadionuclideAddLocalServiceWrapper(
		RadionuclideAddLocalService radionuclideAddLocalService) {

		_radionuclideAddLocalService = radionuclideAddLocalService;
	}

	/**
	 * Adds the radionuclide add to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect RadionuclideAddLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param radionuclideAdd the radionuclide add
	 * @return the radionuclide add that was added
	 */
	@Override
	public com.nbp.hsra.application.service.model.RadionuclideAdd
		addRadionuclideAdd(
			com.nbp.hsra.application.service.model.RadionuclideAdd
				radionuclideAdd) {

		return _radionuclideAddLocalService.addRadionuclideAdd(radionuclideAdd);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _radionuclideAddLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Creates a new radionuclide add with the primary key. Does not add the radionuclide add to the database.
	 *
	 * @param radionuclideAddId the primary key for the new radionuclide add
	 * @return the new radionuclide add
	 */
	@Override
	public com.nbp.hsra.application.service.model.RadionuclideAdd
		createRadionuclideAdd(long radionuclideAddId) {

		return _radionuclideAddLocalService.createRadionuclideAdd(
			radionuclideAddId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _radionuclideAddLocalService.deletePersistedModel(
			persistedModel);
	}

	/**
	 * Deletes the radionuclide add with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect RadionuclideAddLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param radionuclideAddId the primary key of the radionuclide add
	 * @return the radionuclide add that was removed
	 * @throws PortalException if a radionuclide add with the primary key could not be found
	 */
	@Override
	public com.nbp.hsra.application.service.model.RadionuclideAdd
			deleteRadionuclideAdd(long radionuclideAddId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _radionuclideAddLocalService.deleteRadionuclideAdd(
			radionuclideAddId);
	}

	/**
	 * Deletes the radionuclide add from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect RadionuclideAddLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param radionuclideAdd the radionuclide add
	 * @return the radionuclide add that was removed
	 */
	@Override
	public com.nbp.hsra.application.service.model.RadionuclideAdd
		deleteRadionuclideAdd(
			com.nbp.hsra.application.service.model.RadionuclideAdd
				radionuclideAdd) {

		return _radionuclideAddLocalService.deleteRadionuclideAdd(
			radionuclideAdd);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _radionuclideAddLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _radionuclideAddLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _radionuclideAddLocalService.dynamicQuery();
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

		return _radionuclideAddLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.hsra.application.service.model.impl.RadionuclideAddModelImpl</code>.
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

		return _radionuclideAddLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.hsra.application.service.model.impl.RadionuclideAddModelImpl</code>.
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

		return _radionuclideAddLocalService.dynamicQuery(
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

		return _radionuclideAddLocalService.dynamicQueryCount(dynamicQuery);
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

		return _radionuclideAddLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.hsra.application.service.model.RadionuclideAdd
		fetchRadionuclideAdd(long radionuclideAddId) {

		return _radionuclideAddLocalService.fetchRadionuclideAdd(
			radionuclideAddId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _radionuclideAddLocalService.getActionableDynamicQuery();
	}

	@Override
	public java.util.List
		<com.nbp.hsra.application.service.model.RadionuclideAdd> getHsraById(
			long hsraApplicationId) {

		return _radionuclideAddLocalService.getHsraById(hsraApplicationId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _radionuclideAddLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _radionuclideAddLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _radionuclideAddLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the radionuclide add with the primary key.
	 *
	 * @param radionuclideAddId the primary key of the radionuclide add
	 * @return the radionuclide add
	 * @throws PortalException if a radionuclide add with the primary key could not be found
	 */
	@Override
	public com.nbp.hsra.application.service.model.RadionuclideAdd
			getRadionuclideAdd(long radionuclideAddId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _radionuclideAddLocalService.getRadionuclideAdd(
			radionuclideAddId);
	}

	/**
	 * Returns a range of all the radionuclide adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.hsra.application.service.model.impl.RadionuclideAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of radionuclide adds
	 * @param end the upper bound of the range of radionuclide adds (not inclusive)
	 * @return the range of radionuclide adds
	 */
	@Override
	public java.util.List
		<com.nbp.hsra.application.service.model.RadionuclideAdd>
			getRadionuclideAdds(int start, int end) {

		return _radionuclideAddLocalService.getRadionuclideAdds(start, end);
	}

	/**
	 * Returns the number of radionuclide adds.
	 *
	 * @return the number of radionuclide adds
	 */
	@Override
	public int getRadionuclideAddsCount() {
		return _radionuclideAddLocalService.getRadionuclideAddsCount();
	}

	/**
	 * Updates the radionuclide add in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect RadionuclideAddLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param radionuclideAdd the radionuclide add
	 * @return the radionuclide add that was updated
	 */
	@Override
	public com.nbp.hsra.application.service.model.RadionuclideAdd
		updateRadionuclideAdd(
			com.nbp.hsra.application.service.model.RadionuclideAdd
				radionuclideAdd) {

		return _radionuclideAddLocalService.updateRadionuclideAdd(
			radionuclideAdd);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _radionuclideAddLocalService.getBasePersistence();
	}

	@Override
	public RadionuclideAddLocalService getWrappedService() {
		return _radionuclideAddLocalService;
	}

	@Override
	public void setWrappedService(
		RadionuclideAddLocalService radionuclideAddLocalService) {

		_radionuclideAddLocalService = radionuclideAddLocalService;
	}

	private RadionuclideAddLocalService _radionuclideAddLocalService;

}