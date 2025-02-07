/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link AddCerPersonnelThirdLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see AddCerPersonnelThirdLocalService
 * @generated
 */
public class AddCerPersonnelThirdLocalServiceWrapper
	implements AddCerPersonnelThirdLocalService,
			   ServiceWrapper<AddCerPersonnelThirdLocalService> {

	public AddCerPersonnelThirdLocalServiceWrapper() {
		this(null);
	}

	public AddCerPersonnelThirdLocalServiceWrapper(
		AddCerPersonnelThirdLocalService addCerPersonnelThirdLocalService) {

		_addCerPersonnelThirdLocalService = addCerPersonnelThirdLocalService;
	}

	/**
	 * Adds the add cer personnel third to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AddCerPersonnelThirdLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param addCerPersonnelThird the add cer personnel third
	 * @return the add cer personnel third that was added
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AddCerPersonnelThird
		addAddCerPersonnelThird(
			com.nbp.janaac.application.form.service.model.AddCerPersonnelThird
				addCerPersonnelThird) {

		return _addCerPersonnelThirdLocalService.addAddCerPersonnelThird(
			addCerPersonnelThird);
	}

	/**
	 * Creates a new add cer personnel third with the primary key. Does not add the add cer personnel third to the database.
	 *
	 * @param addCerPersonnelThirdId the primary key for the new add cer personnel third
	 * @return the new add cer personnel third
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AddCerPersonnelThird
		createAddCerPersonnelThird(long addCerPersonnelThirdId) {

		return _addCerPersonnelThirdLocalService.createAddCerPersonnelThird(
			addCerPersonnelThirdId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _addCerPersonnelThirdLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the add cer personnel third from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AddCerPersonnelThirdLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param addCerPersonnelThird the add cer personnel third
	 * @return the add cer personnel third that was removed
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AddCerPersonnelThird
		deleteAddCerPersonnelThird(
			com.nbp.janaac.application.form.service.model.AddCerPersonnelThird
				addCerPersonnelThird) {

		return _addCerPersonnelThirdLocalService.deleteAddCerPersonnelThird(
			addCerPersonnelThird);
	}

	/**
	 * Deletes the add cer personnel third with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AddCerPersonnelThirdLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param addCerPersonnelThirdId the primary key of the add cer personnel third
	 * @return the add cer personnel third that was removed
	 * @throws PortalException if a add cer personnel third with the primary key could not be found
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AddCerPersonnelThird
			deleteAddCerPersonnelThird(long addCerPersonnelThirdId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _addCerPersonnelThirdLocalService.deleteAddCerPersonnelThird(
			addCerPersonnelThirdId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _addCerPersonnelThirdLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _addCerPersonnelThirdLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _addCerPersonnelThirdLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _addCerPersonnelThirdLocalService.dynamicQuery();
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

		return _addCerPersonnelThirdLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AddCerPersonnelThirdModelImpl</code>.
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

		return _addCerPersonnelThirdLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AddCerPersonnelThirdModelImpl</code>.
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

		return _addCerPersonnelThirdLocalService.dynamicQuery(
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

		return _addCerPersonnelThirdLocalService.dynamicQueryCount(
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

		return _addCerPersonnelThirdLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.janaac.application.form.service.model.AddCerPersonnelThird
		fetchAddCerPersonnelThird(long addCerPersonnelThirdId) {

		return _addCerPersonnelThirdLocalService.fetchAddCerPersonnelThird(
			addCerPersonnelThirdId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _addCerPersonnelThirdLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the add cer personnel third with the primary key.
	 *
	 * @param addCerPersonnelThirdId the primary key of the add cer personnel third
	 * @return the add cer personnel third
	 * @throws PortalException if a add cer personnel third with the primary key could not be found
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AddCerPersonnelThird
			getAddCerPersonnelThird(long addCerPersonnelThirdId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _addCerPersonnelThirdLocalService.getAddCerPersonnelThird(
			addCerPersonnelThirdId);
	}

	/**
	 * Returns a range of all the add cer personnel thirds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AddCerPersonnelThirdModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add cer personnel thirds
	 * @param end the upper bound of the range of add cer personnel thirds (not inclusive)
	 * @return the range of add cer personnel thirds
	 */
	@Override
	public java.util.List
		<com.nbp.janaac.application.form.service.model.AddCerPersonnelThird>
			getAddCerPersonnelThirds(int start, int end) {

		return _addCerPersonnelThirdLocalService.getAddCerPersonnelThirds(
			start, end);
	}

	/**
	 * Returns the number of add cer personnel thirds.
	 *
	 * @return the number of add cer personnel thirds
	 */
	@Override
	public int getAddCerPersonnelThirdsCount() {
		return _addCerPersonnelThirdLocalService.
			getAddCerPersonnelThirdsCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _addCerPersonnelThirdLocalService.
			getIndexableActionableDynamicQuery();
	}

	@Override
	public java.util.List
		<com.nbp.janaac.application.form.service.model.AddCerPersonnelThird>
			getJANAAC_ByApplicationId(long janaacApplicationId) {

		return _addCerPersonnelThirdLocalService.getJANAAC_ByApplicationId(
			janaacApplicationId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _addCerPersonnelThirdLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _addCerPersonnelThirdLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the add cer personnel third in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AddCerPersonnelThirdLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param addCerPersonnelThird the add cer personnel third
	 * @return the add cer personnel third that was updated
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AddCerPersonnelThird
		updateAddCerPersonnelThird(
			com.nbp.janaac.application.form.service.model.AddCerPersonnelThird
				addCerPersonnelThird) {

		return _addCerPersonnelThirdLocalService.updateAddCerPersonnelThird(
			addCerPersonnelThird);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _addCerPersonnelThirdLocalService.getBasePersistence();
	}

	@Override
	public AddCerPersonnelThirdLocalService getWrappedService() {
		return _addCerPersonnelThirdLocalService;
	}

	@Override
	public void setWrappedService(
		AddCerPersonnelThirdLocalService addCerPersonnelThirdLocalService) {

		_addCerPersonnelThirdLocalService = addCerPersonnelThirdLocalService;
	}

	private AddCerPersonnelThirdLocalService _addCerPersonnelThirdLocalService;

}