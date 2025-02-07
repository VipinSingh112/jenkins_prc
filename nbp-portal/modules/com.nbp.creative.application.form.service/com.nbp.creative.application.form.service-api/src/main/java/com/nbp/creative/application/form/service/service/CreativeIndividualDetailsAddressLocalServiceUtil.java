/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.creative.application.form.service.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.creative.application.form.service.model.CreativeIndividualDetailsAddress;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for CreativeIndividualDetailsAddress. This utility wraps
 * <code>com.nbp.creative.application.form.service.service.impl.CreativeIndividualDetailsAddressLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see CreativeIndividualDetailsAddressLocalService
 * @generated
 */
public class CreativeIndividualDetailsAddressLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.creative.application.form.service.service.impl.CreativeIndividualDetailsAddressLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the creative individual details address to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CreativeIndividualDetailsAddressLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param creativeIndividualDetailsAddress the creative individual details address
	 * @return the creative individual details address that was added
	 */
	public static CreativeIndividualDetailsAddress
		addCreativeIndividualDetailsAddress(
			CreativeIndividualDetailsAddress creativeIndividualDetailsAddress) {

		return getService().addCreativeIndividualDetailsAddress(
			creativeIndividualDetailsAddress);
	}

	/**
	 * Creates a new creative individual details address with the primary key. Does not add the creative individual details address to the database.
	 *
	 * @param creativeIndiDetailsAddressId the primary key for the new creative individual details address
	 * @return the new creative individual details address
	 */
	public static CreativeIndividualDetailsAddress
		createCreativeIndividualDetailsAddress(
			long creativeIndiDetailsAddressId) {

		return getService().createCreativeIndividualDetailsAddress(
			creativeIndiDetailsAddressId);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel createPersistedModel(
			Serializable primaryKeyObj)
		throws PortalException {

		return getService().createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the creative individual details address from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CreativeIndividualDetailsAddressLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param creativeIndividualDetailsAddress the creative individual details address
	 * @return the creative individual details address that was removed
	 */
	public static CreativeIndividualDetailsAddress
		deleteCreativeIndividualDetailsAddress(
			CreativeIndividualDetailsAddress creativeIndividualDetailsAddress) {

		return getService().deleteCreativeIndividualDetailsAddress(
			creativeIndividualDetailsAddress);
	}

	/**
	 * Deletes the creative individual details address with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CreativeIndividualDetailsAddressLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param creativeIndiDetailsAddressId the primary key of the creative individual details address
	 * @return the creative individual details address that was removed
	 * @throws PortalException if a creative individual details address with the primary key could not be found
	 */
	public static CreativeIndividualDetailsAddress
			deleteCreativeIndividualDetailsAddress(
				long creativeIndiDetailsAddressId)
		throws PortalException {

		return getService().deleteCreativeIndividualDetailsAddress(
			creativeIndiDetailsAddressId);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel deletePersistedModel(
			PersistedModel persistedModel)
		throws PortalException {

		return getService().deletePersistedModel(persistedModel);
	}

	public static <T> T dslQuery(DSLQuery dslQuery) {
		return getService().dslQuery(dslQuery);
	}

	public static int dslQueryCount(DSLQuery dslQuery) {
		return getService().dslQueryCount(dslQuery);
	}

	public static DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	public static <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.creative.application.form.service.model.impl.CreativeIndividualDetailsAddressModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	public static <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.creative.application.form.service.model.impl.CreativeIndividualDetailsAddressModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	public static <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<T> orderByComparator) {

		return getService().dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(DynamicQuery dynamicQuery) {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static CreativeIndividualDetailsAddress
		fetchCreativeIndividualDetailsAddress(
			long creativeIndiDetailsAddressId) {

		return getService().fetchCreativeIndividualDetailsAddress(
			creativeIndiDetailsAddressId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static CreativeIndividualDetailsAddress
		getCreativeCompanyAddressById(long creativeApplicationId) {

		return getService().getCreativeCompanyAddressById(
			creativeApplicationId);
	}

	/**
	 * Returns the creative individual details address with the primary key.
	 *
	 * @param creativeIndiDetailsAddressId the primary key of the creative individual details address
	 * @return the creative individual details address
	 * @throws PortalException if a creative individual details address with the primary key could not be found
	 */
	public static CreativeIndividualDetailsAddress
			getCreativeIndividualDetailsAddress(
				long creativeIndiDetailsAddressId)
		throws PortalException {

		return getService().getCreativeIndividualDetailsAddress(
			creativeIndiDetailsAddressId);
	}

	/**
	 * Returns a range of all the creative individual details addresses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.creative.application.form.service.model.impl.CreativeIndividualDetailsAddressModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of creative individual details addresses
	 * @param end the upper bound of the range of creative individual details addresses (not inclusive)
	 * @return the range of creative individual details addresses
	 */
	public static List<CreativeIndividualDetailsAddress>
		getCreativeIndividualDetailsAddresses(int start, int end) {

		return getService().getCreativeIndividualDetailsAddresses(start, end);
	}

	/**
	 * Returns the number of creative individual details addresses.
	 *
	 * @return the number of creative individual details addresses
	 */
	public static int getCreativeIndividualDetailsAddressesCount() {
		return getService().getCreativeIndividualDetailsAddressesCount();
	}

	public static
		com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
			getIndexableActionableDynamicQuery() {

		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the creative individual details address in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CreativeIndividualDetailsAddressLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param creativeIndividualDetailsAddress the creative individual details address
	 * @return the creative individual details address that was updated
	 */
	public static CreativeIndividualDetailsAddress
		updateCreativeIndividualDetailsAddress(
			CreativeIndividualDetailsAddress creativeIndividualDetailsAddress) {

		return getService().updateCreativeIndividualDetailsAddress(
			creativeIndividualDetailsAddress);
	}

	public static CreativeIndividualDetailsAddressLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<CreativeIndividualDetailsAddressLocalService>
		_serviceSnapshot = new Snapshot<>(
			CreativeIndividualDetailsAddressLocalServiceUtil.class,
			CreativeIndividualDetailsAddressLocalService.class);

}