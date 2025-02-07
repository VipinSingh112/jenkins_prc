/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link AddCerScopeServiceThirdLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see AddCerScopeServiceThirdLocalService
 * @generated
 */
public class AddCerScopeServiceThirdLocalServiceWrapper
	implements AddCerScopeServiceThirdLocalService,
			   ServiceWrapper<AddCerScopeServiceThirdLocalService> {

	public AddCerScopeServiceThirdLocalServiceWrapper() {
		this(null);
	}

	public AddCerScopeServiceThirdLocalServiceWrapper(
		AddCerScopeServiceThirdLocalService
			addCerScopeServiceThirdLocalService) {

		_addCerScopeServiceThirdLocalService =
			addCerScopeServiceThirdLocalService;
	}

	/**
	 * Adds the add cer scope service third to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AddCerScopeServiceThirdLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param addCerScopeServiceThird the add cer scope service third
	 * @return the add cer scope service third that was added
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AddCerScopeServiceThird
		addAddCerScopeServiceThird(
			com.nbp.janaac.application.form.service.model.
				AddCerScopeServiceThird addCerScopeServiceThird) {

		return _addCerScopeServiceThirdLocalService.addAddCerScopeServiceThird(
			addCerScopeServiceThird);
	}

	/**
	 * Creates a new add cer scope service third with the primary key. Does not add the add cer scope service third to the database.
	 *
	 * @param addCerScopeServiceThirdId the primary key for the new add cer scope service third
	 * @return the new add cer scope service third
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AddCerScopeServiceThird
		createAddCerScopeServiceThird(long addCerScopeServiceThirdId) {

		return _addCerScopeServiceThirdLocalService.
			createAddCerScopeServiceThird(addCerScopeServiceThirdId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _addCerScopeServiceThirdLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the add cer scope service third from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AddCerScopeServiceThirdLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param addCerScopeServiceThird the add cer scope service third
	 * @return the add cer scope service third that was removed
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AddCerScopeServiceThird
		deleteAddCerScopeServiceThird(
			com.nbp.janaac.application.form.service.model.
				AddCerScopeServiceThird addCerScopeServiceThird) {

		return _addCerScopeServiceThirdLocalService.
			deleteAddCerScopeServiceThird(addCerScopeServiceThird);
	}

	/**
	 * Deletes the add cer scope service third with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AddCerScopeServiceThirdLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param addCerScopeServiceThirdId the primary key of the add cer scope service third
	 * @return the add cer scope service third that was removed
	 * @throws PortalException if a add cer scope service third with the primary key could not be found
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AddCerScopeServiceThird
			deleteAddCerScopeServiceThird(long addCerScopeServiceThirdId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _addCerScopeServiceThirdLocalService.
			deleteAddCerScopeServiceThird(addCerScopeServiceThirdId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _addCerScopeServiceThirdLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _addCerScopeServiceThirdLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _addCerScopeServiceThirdLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _addCerScopeServiceThirdLocalService.dynamicQuery();
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

		return _addCerScopeServiceThirdLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AddCerScopeServiceThirdModelImpl</code>.
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

		return _addCerScopeServiceThirdLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AddCerScopeServiceThirdModelImpl</code>.
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

		return _addCerScopeServiceThirdLocalService.dynamicQuery(
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

		return _addCerScopeServiceThirdLocalService.dynamicQueryCount(
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

		return _addCerScopeServiceThirdLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.janaac.application.form.service.model.AddCerScopeServiceThird
		fetchAddCerScopeServiceThird(long addCerScopeServiceThirdId) {

		return _addCerScopeServiceThirdLocalService.
			fetchAddCerScopeServiceThird(addCerScopeServiceThirdId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _addCerScopeServiceThirdLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the add cer scope service third with the primary key.
	 *
	 * @param addCerScopeServiceThirdId the primary key of the add cer scope service third
	 * @return the add cer scope service third
	 * @throws PortalException if a add cer scope service third with the primary key could not be found
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AddCerScopeServiceThird
			getAddCerScopeServiceThird(long addCerScopeServiceThirdId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _addCerScopeServiceThirdLocalService.getAddCerScopeServiceThird(
			addCerScopeServiceThirdId);
	}

	/**
	 * Returns a range of all the add cer scope service thirds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AddCerScopeServiceThirdModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add cer scope service thirds
	 * @param end the upper bound of the range of add cer scope service thirds (not inclusive)
	 * @return the range of add cer scope service thirds
	 */
	@Override
	public java.util.List
		<com.nbp.janaac.application.form.service.model.AddCerScopeServiceThird>
			getAddCerScopeServiceThirds(int start, int end) {

		return _addCerScopeServiceThirdLocalService.getAddCerScopeServiceThirds(
			start, end);
	}

	/**
	 * Returns the number of add cer scope service thirds.
	 *
	 * @return the number of add cer scope service thirds
	 */
	@Override
	public int getAddCerScopeServiceThirdsCount() {
		return _addCerScopeServiceThirdLocalService.
			getAddCerScopeServiceThirdsCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _addCerScopeServiceThirdLocalService.
			getIndexableActionableDynamicQuery();
	}

	@Override
	public java.util.List
		<com.nbp.janaac.application.form.service.model.AddCerScopeServiceThird>
			getJANAAC_ByApplicationId(long janaacApplicationId) {

		return _addCerScopeServiceThirdLocalService.getJANAAC_ByApplicationId(
			janaacApplicationId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _addCerScopeServiceThirdLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _addCerScopeServiceThirdLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the add cer scope service third in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AddCerScopeServiceThirdLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param addCerScopeServiceThird the add cer scope service third
	 * @return the add cer scope service third that was updated
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AddCerScopeServiceThird
		updateAddCerScopeServiceThird(
			com.nbp.janaac.application.form.service.model.
				AddCerScopeServiceThird addCerScopeServiceThird) {

		return _addCerScopeServiceThirdLocalService.
			updateAddCerScopeServiceThird(addCerScopeServiceThird);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _addCerScopeServiceThirdLocalService.getBasePersistence();
	}

	@Override
	public AddCerScopeServiceThirdLocalService getWrappedService() {
		return _addCerScopeServiceThirdLocalService;
	}

	@Override
	public void setWrappedService(
		AddCerScopeServiceThirdLocalService
			addCerScopeServiceThirdLocalService) {

		_addCerScopeServiceThirdLocalService =
			addCerScopeServiceThirdLocalService;
	}

	private AddCerScopeServiceThirdLocalService
		_addCerScopeServiceThirdLocalService;

}