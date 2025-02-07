/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link AddFdaPersonnelFourLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see AddFdaPersonnelFourLocalService
 * @generated
 */
public class AddFdaPersonnelFourLocalServiceWrapper
	implements AddFdaPersonnelFourLocalService,
			   ServiceWrapper<AddFdaPersonnelFourLocalService> {

	public AddFdaPersonnelFourLocalServiceWrapper() {
		this(null);
	}

	public AddFdaPersonnelFourLocalServiceWrapper(
		AddFdaPersonnelFourLocalService addFdaPersonnelFourLocalService) {

		_addFdaPersonnelFourLocalService = addFdaPersonnelFourLocalService;
	}

	/**
	 * Adds the add fda personnel four to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AddFdaPersonnelFourLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param addFdaPersonnelFour the add fda personnel four
	 * @return the add fda personnel four that was added
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AddFdaPersonnelFour
		addAddFdaPersonnelFour(
			com.nbp.janaac.application.form.service.model.AddFdaPersonnelFour
				addFdaPersonnelFour) {

		return _addFdaPersonnelFourLocalService.addAddFdaPersonnelFour(
			addFdaPersonnelFour);
	}

	/**
	 * Creates a new add fda personnel four with the primary key. Does not add the add fda personnel four to the database.
	 *
	 * @param addFdaPersonnelFourId the primary key for the new add fda personnel four
	 * @return the new add fda personnel four
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AddFdaPersonnelFour
		createAddFdaPersonnelFour(long addFdaPersonnelFourId) {

		return _addFdaPersonnelFourLocalService.createAddFdaPersonnelFour(
			addFdaPersonnelFourId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _addFdaPersonnelFourLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the add fda personnel four from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AddFdaPersonnelFourLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param addFdaPersonnelFour the add fda personnel four
	 * @return the add fda personnel four that was removed
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AddFdaPersonnelFour
		deleteAddFdaPersonnelFour(
			com.nbp.janaac.application.form.service.model.AddFdaPersonnelFour
				addFdaPersonnelFour) {

		return _addFdaPersonnelFourLocalService.deleteAddFdaPersonnelFour(
			addFdaPersonnelFour);
	}

	/**
	 * Deletes the add fda personnel four with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AddFdaPersonnelFourLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param addFdaPersonnelFourId the primary key of the add fda personnel four
	 * @return the add fda personnel four that was removed
	 * @throws PortalException if a add fda personnel four with the primary key could not be found
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AddFdaPersonnelFour
			deleteAddFdaPersonnelFour(long addFdaPersonnelFourId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _addFdaPersonnelFourLocalService.deleteAddFdaPersonnelFour(
			addFdaPersonnelFourId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _addFdaPersonnelFourLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _addFdaPersonnelFourLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _addFdaPersonnelFourLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _addFdaPersonnelFourLocalService.dynamicQuery();
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

		return _addFdaPersonnelFourLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AddFdaPersonnelFourModelImpl</code>.
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

		return _addFdaPersonnelFourLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AddFdaPersonnelFourModelImpl</code>.
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

		return _addFdaPersonnelFourLocalService.dynamicQuery(
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

		return _addFdaPersonnelFourLocalService.dynamicQueryCount(dynamicQuery);
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

		return _addFdaPersonnelFourLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.janaac.application.form.service.model.AddFdaPersonnelFour
		fetchAddFdaPersonnelFour(long addFdaPersonnelFourId) {

		return _addFdaPersonnelFourLocalService.fetchAddFdaPersonnelFour(
			addFdaPersonnelFourId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _addFdaPersonnelFourLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the add fda personnel four with the primary key.
	 *
	 * @param addFdaPersonnelFourId the primary key of the add fda personnel four
	 * @return the add fda personnel four
	 * @throws PortalException if a add fda personnel four with the primary key could not be found
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AddFdaPersonnelFour
			getAddFdaPersonnelFour(long addFdaPersonnelFourId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _addFdaPersonnelFourLocalService.getAddFdaPersonnelFour(
			addFdaPersonnelFourId);
	}

	/**
	 * Returns a range of all the add fda personnel fours.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AddFdaPersonnelFourModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add fda personnel fours
	 * @param end the upper bound of the range of add fda personnel fours (not inclusive)
	 * @return the range of add fda personnel fours
	 */
	@Override
	public java.util.List
		<com.nbp.janaac.application.form.service.model.AddFdaPersonnelFour>
			getAddFdaPersonnelFours(int start, int end) {

		return _addFdaPersonnelFourLocalService.getAddFdaPersonnelFours(
			start, end);
	}

	/**
	 * Returns the number of add fda personnel fours.
	 *
	 * @return the number of add fda personnel fours
	 */
	@Override
	public int getAddFdaPersonnelFoursCount() {
		return _addFdaPersonnelFourLocalService.getAddFdaPersonnelFoursCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _addFdaPersonnelFourLocalService.
			getIndexableActionableDynamicQuery();
	}

	@Override
	public java.util.List
		<com.nbp.janaac.application.form.service.model.AddFdaPersonnelFour>
			getJANAAC_ByApplicationId(long janaacApplicationId) {

		return _addFdaPersonnelFourLocalService.getJANAAC_ByApplicationId(
			janaacApplicationId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _addFdaPersonnelFourLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _addFdaPersonnelFourLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the add fda personnel four in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AddFdaPersonnelFourLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param addFdaPersonnelFour the add fda personnel four
	 * @return the add fda personnel four that was updated
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AddFdaPersonnelFour
		updateAddFdaPersonnelFour(
			com.nbp.janaac.application.form.service.model.AddFdaPersonnelFour
				addFdaPersonnelFour) {

		return _addFdaPersonnelFourLocalService.updateAddFdaPersonnelFour(
			addFdaPersonnelFour);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _addFdaPersonnelFourLocalService.getBasePersistence();
	}

	@Override
	public AddFdaPersonnelFourLocalService getWrappedService() {
		return _addFdaPersonnelFourLocalService;
	}

	@Override
	public void setWrappedService(
		AddFdaPersonnelFourLocalService addFdaPersonnelFourLocalService) {

		_addFdaPersonnelFourLocalService = addFdaPersonnelFourLocalService;
	}

	private AddFdaPersonnelFourLocalService _addFdaPersonnelFourLocalService;

}