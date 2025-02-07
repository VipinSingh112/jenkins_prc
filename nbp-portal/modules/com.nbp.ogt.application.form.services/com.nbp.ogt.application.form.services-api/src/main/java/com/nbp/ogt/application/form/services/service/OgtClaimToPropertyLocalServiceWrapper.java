/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ogt.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link OgtClaimToPropertyLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see OgtClaimToPropertyLocalService
 * @generated
 */
public class OgtClaimToPropertyLocalServiceWrapper
	implements OgtClaimToPropertyLocalService,
			   ServiceWrapper<OgtClaimToPropertyLocalService> {

	public OgtClaimToPropertyLocalServiceWrapper() {
		this(null);
	}

	public OgtClaimToPropertyLocalServiceWrapper(
		OgtClaimToPropertyLocalService ogtClaimToPropertyLocalService) {

		_ogtClaimToPropertyLocalService = ogtClaimToPropertyLocalService;
	}

	/**
	 * Adds the ogt claim to property to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OgtClaimToPropertyLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ogtClaimToProperty the ogt claim to property
	 * @return the ogt claim to property that was added
	 */
	@Override
	public com.nbp.ogt.application.form.services.model.OgtClaimToProperty
		addOgtClaimToProperty(
			com.nbp.ogt.application.form.services.model.OgtClaimToProperty
				ogtClaimToProperty) {

		return _ogtClaimToPropertyLocalService.addOgtClaimToProperty(
			ogtClaimToProperty);
	}

	/**
	 * Creates a new ogt claim to property with the primary key. Does not add the ogt claim to property to the database.
	 *
	 * @param ogtClaimToPropertyId the primary key for the new ogt claim to property
	 * @return the new ogt claim to property
	 */
	@Override
	public com.nbp.ogt.application.form.services.model.OgtClaimToProperty
		createOgtClaimToProperty(long ogtClaimToPropertyId) {

		return _ogtClaimToPropertyLocalService.createOgtClaimToProperty(
			ogtClaimToPropertyId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ogtClaimToPropertyLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the ogt claim to property with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OgtClaimToPropertyLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ogtClaimToPropertyId the primary key of the ogt claim to property
	 * @return the ogt claim to property that was removed
	 * @throws PortalException if a ogt claim to property with the primary key could not be found
	 */
	@Override
	public com.nbp.ogt.application.form.services.model.OgtClaimToProperty
			deleteOgtClaimToProperty(long ogtClaimToPropertyId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ogtClaimToPropertyLocalService.deleteOgtClaimToProperty(
			ogtClaimToPropertyId);
	}

	/**
	 * Deletes the ogt claim to property from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OgtClaimToPropertyLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ogtClaimToProperty the ogt claim to property
	 * @return the ogt claim to property that was removed
	 */
	@Override
	public com.nbp.ogt.application.form.services.model.OgtClaimToProperty
		deleteOgtClaimToProperty(
			com.nbp.ogt.application.form.services.model.OgtClaimToProperty
				ogtClaimToProperty) {

		return _ogtClaimToPropertyLocalService.deleteOgtClaimToProperty(
			ogtClaimToProperty);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ogtClaimToPropertyLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _ogtClaimToPropertyLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _ogtClaimToPropertyLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _ogtClaimToPropertyLocalService.dynamicQuery();
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

		return _ogtClaimToPropertyLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ogt.application.form.services.model.impl.OgtClaimToPropertyModelImpl</code>.
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

		return _ogtClaimToPropertyLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ogt.application.form.services.model.impl.OgtClaimToPropertyModelImpl</code>.
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

		return _ogtClaimToPropertyLocalService.dynamicQuery(
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

		return _ogtClaimToPropertyLocalService.dynamicQueryCount(dynamicQuery);
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

		return _ogtClaimToPropertyLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.ogt.application.form.services.model.OgtClaimToProperty
		fetchOgtClaimToProperty(long ogtClaimToPropertyId) {

		return _ogtClaimToPropertyLocalService.fetchOgtClaimToProperty(
			ogtClaimToPropertyId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _ogtClaimToPropertyLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _ogtClaimToPropertyLocalService.
			getIndexableActionableDynamicQuery();
	}

	@Override
	public com.nbp.ogt.application.form.services.model.OgtClaimToProperty
			getOgtById(long ogtApplicationId)
		throws com.nbp.ogt.application.form.services.exception.
			NoSuchOgtClaimToPropertyException {

		return _ogtClaimToPropertyLocalService.getOgtById(ogtApplicationId);
	}

	/**
	 * Returns a range of all the ogt claim to properties.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ogt.application.form.services.model.impl.OgtClaimToPropertyModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ogt claim to properties
	 * @param end the upper bound of the range of ogt claim to properties (not inclusive)
	 * @return the range of ogt claim to properties
	 */
	@Override
	public java.util.List
		<com.nbp.ogt.application.form.services.model.OgtClaimToProperty>
			getOgtClaimToProperties(int start, int end) {

		return _ogtClaimToPropertyLocalService.getOgtClaimToProperties(
			start, end);
	}

	/**
	 * Returns the number of ogt claim to properties.
	 *
	 * @return the number of ogt claim to properties
	 */
	@Override
	public int getOgtClaimToPropertiesCount() {
		return _ogtClaimToPropertyLocalService.getOgtClaimToPropertiesCount();
	}

	/**
	 * Returns the ogt claim to property with the primary key.
	 *
	 * @param ogtClaimToPropertyId the primary key of the ogt claim to property
	 * @return the ogt claim to property
	 * @throws PortalException if a ogt claim to property with the primary key could not be found
	 */
	@Override
	public com.nbp.ogt.application.form.services.model.OgtClaimToProperty
			getOgtClaimToProperty(long ogtClaimToPropertyId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ogtClaimToPropertyLocalService.getOgtClaimToProperty(
			ogtClaimToPropertyId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _ogtClaimToPropertyLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ogtClaimToPropertyLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the ogt claim to property in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OgtClaimToPropertyLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ogtClaimToProperty the ogt claim to property
	 * @return the ogt claim to property that was updated
	 */
	@Override
	public com.nbp.ogt.application.form.services.model.OgtClaimToProperty
		updateOgtClaimToProperty(
			com.nbp.ogt.application.form.services.model.OgtClaimToProperty
				ogtClaimToProperty) {

		return _ogtClaimToPropertyLocalService.updateOgtClaimToProperty(
			ogtClaimToProperty);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _ogtClaimToPropertyLocalService.getBasePersistence();
	}

	@Override
	public OgtClaimToPropertyLocalService getWrappedService() {
		return _ogtClaimToPropertyLocalService;
	}

	@Override
	public void setWrappedService(
		OgtClaimToPropertyLocalService ogtClaimToPropertyLocalService) {

		_ogtClaimToPropertyLocalService = ogtClaimToPropertyLocalService;
	}

	private OgtClaimToPropertyLocalService _ogtClaimToPropertyLocalService;

}