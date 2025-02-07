/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link AddFdaPersonnelThirdLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see AddFdaPersonnelThirdLocalService
 * @generated
 */
public class AddFdaPersonnelThirdLocalServiceWrapper
	implements AddFdaPersonnelThirdLocalService,
			   ServiceWrapper<AddFdaPersonnelThirdLocalService> {

	public AddFdaPersonnelThirdLocalServiceWrapper() {
		this(null);
	}

	public AddFdaPersonnelThirdLocalServiceWrapper(
		AddFdaPersonnelThirdLocalService addFdaPersonnelThirdLocalService) {

		_addFdaPersonnelThirdLocalService = addFdaPersonnelThirdLocalService;
	}

	/**
	 * Adds the add fda personnel third to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AddFdaPersonnelThirdLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param addFdaPersonnelThird the add fda personnel third
	 * @return the add fda personnel third that was added
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AddFdaPersonnelThird
		addAddFdaPersonnelThird(
			com.nbp.janaac.application.form.service.model.AddFdaPersonnelThird
				addFdaPersonnelThird) {

		return _addFdaPersonnelThirdLocalService.addAddFdaPersonnelThird(
			addFdaPersonnelThird);
	}

	/**
	 * Creates a new add fda personnel third with the primary key. Does not add the add fda personnel third to the database.
	 *
	 * @param addFdaPersonnelThirdId the primary key for the new add fda personnel third
	 * @return the new add fda personnel third
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AddFdaPersonnelThird
		createAddFdaPersonnelThird(long addFdaPersonnelThirdId) {

		return _addFdaPersonnelThirdLocalService.createAddFdaPersonnelThird(
			addFdaPersonnelThirdId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _addFdaPersonnelThirdLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the add fda personnel third from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AddFdaPersonnelThirdLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param addFdaPersonnelThird the add fda personnel third
	 * @return the add fda personnel third that was removed
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AddFdaPersonnelThird
		deleteAddFdaPersonnelThird(
			com.nbp.janaac.application.form.service.model.AddFdaPersonnelThird
				addFdaPersonnelThird) {

		return _addFdaPersonnelThirdLocalService.deleteAddFdaPersonnelThird(
			addFdaPersonnelThird);
	}

	/**
	 * Deletes the add fda personnel third with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AddFdaPersonnelThirdLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param addFdaPersonnelThirdId the primary key of the add fda personnel third
	 * @return the add fda personnel third that was removed
	 * @throws PortalException if a add fda personnel third with the primary key could not be found
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AddFdaPersonnelThird
			deleteAddFdaPersonnelThird(long addFdaPersonnelThirdId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _addFdaPersonnelThirdLocalService.deleteAddFdaPersonnelThird(
			addFdaPersonnelThirdId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _addFdaPersonnelThirdLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _addFdaPersonnelThirdLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _addFdaPersonnelThirdLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _addFdaPersonnelThirdLocalService.dynamicQuery();
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

		return _addFdaPersonnelThirdLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AddFdaPersonnelThirdModelImpl</code>.
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

		return _addFdaPersonnelThirdLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AddFdaPersonnelThirdModelImpl</code>.
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

		return _addFdaPersonnelThirdLocalService.dynamicQuery(
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

		return _addFdaPersonnelThirdLocalService.dynamicQueryCount(
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

		return _addFdaPersonnelThirdLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.janaac.application.form.service.model.AddFdaPersonnelThird
		fetchAddFdaPersonnelThird(long addFdaPersonnelThirdId) {

		return _addFdaPersonnelThirdLocalService.fetchAddFdaPersonnelThird(
			addFdaPersonnelThirdId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _addFdaPersonnelThirdLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the add fda personnel third with the primary key.
	 *
	 * @param addFdaPersonnelThirdId the primary key of the add fda personnel third
	 * @return the add fda personnel third
	 * @throws PortalException if a add fda personnel third with the primary key could not be found
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AddFdaPersonnelThird
			getAddFdaPersonnelThird(long addFdaPersonnelThirdId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _addFdaPersonnelThirdLocalService.getAddFdaPersonnelThird(
			addFdaPersonnelThirdId);
	}

	/**
	 * Returns a range of all the add fda personnel thirds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AddFdaPersonnelThirdModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add fda personnel thirds
	 * @param end the upper bound of the range of add fda personnel thirds (not inclusive)
	 * @return the range of add fda personnel thirds
	 */
	@Override
	public java.util.List
		<com.nbp.janaac.application.form.service.model.AddFdaPersonnelThird>
			getAddFdaPersonnelThirds(int start, int end) {

		return _addFdaPersonnelThirdLocalService.getAddFdaPersonnelThirds(
			start, end);
	}

	/**
	 * Returns the number of add fda personnel thirds.
	 *
	 * @return the number of add fda personnel thirds
	 */
	@Override
	public int getAddFdaPersonnelThirdsCount() {
		return _addFdaPersonnelThirdLocalService.
			getAddFdaPersonnelThirdsCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _addFdaPersonnelThirdLocalService.
			getIndexableActionableDynamicQuery();
	}

	@Override
	public java.util.List
		<com.nbp.janaac.application.form.service.model.AddFdaPersonnelThird>
			getJANAAC_ByApplicationId(long janaacApplicationId) {

		return _addFdaPersonnelThirdLocalService.getJANAAC_ByApplicationId(
			janaacApplicationId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _addFdaPersonnelThirdLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _addFdaPersonnelThirdLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the add fda personnel third in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AddFdaPersonnelThirdLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param addFdaPersonnelThird the add fda personnel third
	 * @return the add fda personnel third that was updated
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AddFdaPersonnelThird
		updateAddFdaPersonnelThird(
			com.nbp.janaac.application.form.service.model.AddFdaPersonnelThird
				addFdaPersonnelThird) {

		return _addFdaPersonnelThirdLocalService.updateAddFdaPersonnelThird(
			addFdaPersonnelThird);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _addFdaPersonnelThirdLocalService.getBasePersistence();
	}

	@Override
	public AddFdaPersonnelThirdLocalService getWrappedService() {
		return _addFdaPersonnelThirdLocalService;
	}

	@Override
	public void setWrappedService(
		AddFdaPersonnelThirdLocalService addFdaPersonnelThirdLocalService) {

		_addFdaPersonnelThirdLocalService = addFdaPersonnelThirdLocalService;
	}

	private AddFdaPersonnelThirdLocalService _addFdaPersonnelThirdLocalService;

}