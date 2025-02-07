/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link AddFdaPersonnelSecondLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see AddFdaPersonnelSecondLocalService
 * @generated
 */
public class AddFdaPersonnelSecondLocalServiceWrapper
	implements AddFdaPersonnelSecondLocalService,
			   ServiceWrapper<AddFdaPersonnelSecondLocalService> {

	public AddFdaPersonnelSecondLocalServiceWrapper() {
		this(null);
	}

	public AddFdaPersonnelSecondLocalServiceWrapper(
		AddFdaPersonnelSecondLocalService addFdaPersonnelSecondLocalService) {

		_addFdaPersonnelSecondLocalService = addFdaPersonnelSecondLocalService;
	}

	/**
	 * Adds the add fda personnel second to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AddFdaPersonnelSecondLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param addFdaPersonnelSecond the add fda personnel second
	 * @return the add fda personnel second that was added
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AddFdaPersonnelSecond
		addAddFdaPersonnelSecond(
			com.nbp.janaac.application.form.service.model.AddFdaPersonnelSecond
				addFdaPersonnelSecond) {

		return _addFdaPersonnelSecondLocalService.addAddFdaPersonnelSecond(
			addFdaPersonnelSecond);
	}

	/**
	 * Creates a new add fda personnel second with the primary key. Does not add the add fda personnel second to the database.
	 *
	 * @param addFdaPersonnelSecondId the primary key for the new add fda personnel second
	 * @return the new add fda personnel second
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AddFdaPersonnelSecond
		createAddFdaPersonnelSecond(long addFdaPersonnelSecondId) {

		return _addFdaPersonnelSecondLocalService.createAddFdaPersonnelSecond(
			addFdaPersonnelSecondId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _addFdaPersonnelSecondLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the add fda personnel second from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AddFdaPersonnelSecondLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param addFdaPersonnelSecond the add fda personnel second
	 * @return the add fda personnel second that was removed
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AddFdaPersonnelSecond
		deleteAddFdaPersonnelSecond(
			com.nbp.janaac.application.form.service.model.AddFdaPersonnelSecond
				addFdaPersonnelSecond) {

		return _addFdaPersonnelSecondLocalService.deleteAddFdaPersonnelSecond(
			addFdaPersonnelSecond);
	}

	/**
	 * Deletes the add fda personnel second with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AddFdaPersonnelSecondLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param addFdaPersonnelSecondId the primary key of the add fda personnel second
	 * @return the add fda personnel second that was removed
	 * @throws PortalException if a add fda personnel second with the primary key could not be found
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AddFdaPersonnelSecond
			deleteAddFdaPersonnelSecond(long addFdaPersonnelSecondId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _addFdaPersonnelSecondLocalService.deleteAddFdaPersonnelSecond(
			addFdaPersonnelSecondId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _addFdaPersonnelSecondLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _addFdaPersonnelSecondLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _addFdaPersonnelSecondLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _addFdaPersonnelSecondLocalService.dynamicQuery();
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

		return _addFdaPersonnelSecondLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AddFdaPersonnelSecondModelImpl</code>.
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

		return _addFdaPersonnelSecondLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AddFdaPersonnelSecondModelImpl</code>.
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

		return _addFdaPersonnelSecondLocalService.dynamicQuery(
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

		return _addFdaPersonnelSecondLocalService.dynamicQueryCount(
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

		return _addFdaPersonnelSecondLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.janaac.application.form.service.model.AddFdaPersonnelSecond
		fetchAddFdaPersonnelSecond(long addFdaPersonnelSecondId) {

		return _addFdaPersonnelSecondLocalService.fetchAddFdaPersonnelSecond(
			addFdaPersonnelSecondId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _addFdaPersonnelSecondLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the add fda personnel second with the primary key.
	 *
	 * @param addFdaPersonnelSecondId the primary key of the add fda personnel second
	 * @return the add fda personnel second
	 * @throws PortalException if a add fda personnel second with the primary key could not be found
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AddFdaPersonnelSecond
			getAddFdaPersonnelSecond(long addFdaPersonnelSecondId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _addFdaPersonnelSecondLocalService.getAddFdaPersonnelSecond(
			addFdaPersonnelSecondId);
	}

	/**
	 * Returns a range of all the add fda personnel seconds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AddFdaPersonnelSecondModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add fda personnel seconds
	 * @param end the upper bound of the range of add fda personnel seconds (not inclusive)
	 * @return the range of add fda personnel seconds
	 */
	@Override
	public java.util.List
		<com.nbp.janaac.application.form.service.model.AddFdaPersonnelSecond>
			getAddFdaPersonnelSeconds(int start, int end) {

		return _addFdaPersonnelSecondLocalService.getAddFdaPersonnelSeconds(
			start, end);
	}

	/**
	 * Returns the number of add fda personnel seconds.
	 *
	 * @return the number of add fda personnel seconds
	 */
	@Override
	public int getAddFdaPersonnelSecondsCount() {
		return _addFdaPersonnelSecondLocalService.
			getAddFdaPersonnelSecondsCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _addFdaPersonnelSecondLocalService.
			getIndexableActionableDynamicQuery();
	}

	@Override
	public java.util.List
		<com.nbp.janaac.application.form.service.model.AddFdaPersonnelSecond>
			getJANAAC_ByApplicationId(long janaacApplicationId) {

		return _addFdaPersonnelSecondLocalService.getJANAAC_ByApplicationId(
			janaacApplicationId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _addFdaPersonnelSecondLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _addFdaPersonnelSecondLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the add fda personnel second in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AddFdaPersonnelSecondLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param addFdaPersonnelSecond the add fda personnel second
	 * @return the add fda personnel second that was updated
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AddFdaPersonnelSecond
		updateAddFdaPersonnelSecond(
			com.nbp.janaac.application.form.service.model.AddFdaPersonnelSecond
				addFdaPersonnelSecond) {

		return _addFdaPersonnelSecondLocalService.updateAddFdaPersonnelSecond(
			addFdaPersonnelSecond);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _addFdaPersonnelSecondLocalService.getBasePersistence();
	}

	@Override
	public AddFdaPersonnelSecondLocalService getWrappedService() {
		return _addFdaPersonnelSecondLocalService;
	}

	@Override
	public void setWrappedService(
		AddFdaPersonnelSecondLocalService addFdaPersonnelSecondLocalService) {

		_addFdaPersonnelSecondLocalService = addFdaPersonnelSecondLocalService;
	}

	private AddFdaPersonnelSecondLocalService
		_addFdaPersonnelSecondLocalService;

}