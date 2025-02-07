/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link AddInsOrgInfoThirdLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see AddInsOrgInfoThirdLocalService
 * @generated
 */
public class AddInsOrgInfoThirdLocalServiceWrapper
	implements AddInsOrgInfoThirdLocalService,
			   ServiceWrapper<AddInsOrgInfoThirdLocalService> {

	public AddInsOrgInfoThirdLocalServiceWrapper() {
		this(null);
	}

	public AddInsOrgInfoThirdLocalServiceWrapper(
		AddInsOrgInfoThirdLocalService addInsOrgInfoThirdLocalService) {

		_addInsOrgInfoThirdLocalService = addInsOrgInfoThirdLocalService;
	}

	/**
	 * Adds the add ins org info third to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AddInsOrgInfoThirdLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param addInsOrgInfoThird the add ins org info third
	 * @return the add ins org info third that was added
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AddInsOrgInfoThird
		addAddInsOrgInfoThird(
			com.nbp.janaac.application.form.service.model.AddInsOrgInfoThird
				addInsOrgInfoThird) {

		return _addInsOrgInfoThirdLocalService.addAddInsOrgInfoThird(
			addInsOrgInfoThird);
	}

	/**
	 * Creates a new add ins org info third with the primary key. Does not add the add ins org info third to the database.
	 *
	 * @param AddInsOrgInfoThirdId the primary key for the new add ins org info third
	 * @return the new add ins org info third
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AddInsOrgInfoThird
		createAddInsOrgInfoThird(long AddInsOrgInfoThirdId) {

		return _addInsOrgInfoThirdLocalService.createAddInsOrgInfoThird(
			AddInsOrgInfoThirdId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _addInsOrgInfoThirdLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the add ins org info third from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AddInsOrgInfoThirdLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param addInsOrgInfoThird the add ins org info third
	 * @return the add ins org info third that was removed
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AddInsOrgInfoThird
		deleteAddInsOrgInfoThird(
			com.nbp.janaac.application.form.service.model.AddInsOrgInfoThird
				addInsOrgInfoThird) {

		return _addInsOrgInfoThirdLocalService.deleteAddInsOrgInfoThird(
			addInsOrgInfoThird);
	}

	/**
	 * Deletes the add ins org info third with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AddInsOrgInfoThirdLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param AddInsOrgInfoThirdId the primary key of the add ins org info third
	 * @return the add ins org info third that was removed
	 * @throws PortalException if a add ins org info third with the primary key could not be found
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AddInsOrgInfoThird
			deleteAddInsOrgInfoThird(long AddInsOrgInfoThirdId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _addInsOrgInfoThirdLocalService.deleteAddInsOrgInfoThird(
			AddInsOrgInfoThirdId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _addInsOrgInfoThirdLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _addInsOrgInfoThirdLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _addInsOrgInfoThirdLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _addInsOrgInfoThirdLocalService.dynamicQuery();
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

		return _addInsOrgInfoThirdLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AddInsOrgInfoThirdModelImpl</code>.
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

		return _addInsOrgInfoThirdLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AddInsOrgInfoThirdModelImpl</code>.
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

		return _addInsOrgInfoThirdLocalService.dynamicQuery(
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

		return _addInsOrgInfoThirdLocalService.dynamicQueryCount(dynamicQuery);
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

		return _addInsOrgInfoThirdLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.janaac.application.form.service.model.AddInsOrgInfoThird
		fetchAddInsOrgInfoThird(long AddInsOrgInfoThirdId) {

		return _addInsOrgInfoThirdLocalService.fetchAddInsOrgInfoThird(
			AddInsOrgInfoThirdId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _addInsOrgInfoThirdLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the add ins org info third with the primary key.
	 *
	 * @param AddInsOrgInfoThirdId the primary key of the add ins org info third
	 * @return the add ins org info third
	 * @throws PortalException if a add ins org info third with the primary key could not be found
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AddInsOrgInfoThird
			getAddInsOrgInfoThird(long AddInsOrgInfoThirdId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _addInsOrgInfoThirdLocalService.getAddInsOrgInfoThird(
			AddInsOrgInfoThirdId);
	}

	/**
	 * Returns a range of all the add ins org info thirds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AddInsOrgInfoThirdModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add ins org info thirds
	 * @param end the upper bound of the range of add ins org info thirds (not inclusive)
	 * @return the range of add ins org info thirds
	 */
	@Override
	public java.util.List
		<com.nbp.janaac.application.form.service.model.AddInsOrgInfoThird>
			getAddInsOrgInfoThirds(int start, int end) {

		return _addInsOrgInfoThirdLocalService.getAddInsOrgInfoThirds(
			start, end);
	}

	/**
	 * Returns the number of add ins org info thirds.
	 *
	 * @return the number of add ins org info thirds
	 */
	@Override
	public int getAddInsOrgInfoThirdsCount() {
		return _addInsOrgInfoThirdLocalService.getAddInsOrgInfoThirdsCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _addInsOrgInfoThirdLocalService.
			getIndexableActionableDynamicQuery();
	}

	@Override
	public java.util.List
		<com.nbp.janaac.application.form.service.model.AddInsOrgInfoThird>
			getJANAAC_ByApplicationId(long janaacApplicationId) {

		return _addInsOrgInfoThirdLocalService.getJANAAC_ByApplicationId(
			janaacApplicationId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _addInsOrgInfoThirdLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _addInsOrgInfoThirdLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the add ins org info third in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AddInsOrgInfoThirdLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param addInsOrgInfoThird the add ins org info third
	 * @return the add ins org info third that was updated
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AddInsOrgInfoThird
		updateAddInsOrgInfoThird(
			com.nbp.janaac.application.form.service.model.AddInsOrgInfoThird
				addInsOrgInfoThird) {

		return _addInsOrgInfoThirdLocalService.updateAddInsOrgInfoThird(
			addInsOrgInfoThird);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _addInsOrgInfoThirdLocalService.getBasePersistence();
	}

	@Override
	public AddInsOrgInfoThirdLocalService getWrappedService() {
		return _addInsOrgInfoThirdLocalService;
	}

	@Override
	public void setWrappedService(
		AddInsOrgInfoThirdLocalService addInsOrgInfoThirdLocalService) {

		_addInsOrgInfoThirdLocalService = addInsOrgInfoThirdLocalService;
	}

	private AddInsOrgInfoThirdLocalService _addInsOrgInfoThirdLocalService;

}