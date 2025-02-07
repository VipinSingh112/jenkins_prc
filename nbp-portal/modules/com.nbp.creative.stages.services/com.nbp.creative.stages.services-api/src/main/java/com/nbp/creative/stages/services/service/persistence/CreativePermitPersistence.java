/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.creative.stages.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.creative.stages.services.exception.NoSuchCreativePermitException;
import com.nbp.creative.stages.services.model.CreativePermit;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the creative permit service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CreativePermitUtil
 * @generated
 */
@ProviderType
public interface CreativePermitPersistence
	extends BasePersistence<CreativePermit> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CreativePermitUtil} to access the creative permit persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the creative permit where caseId = &#63; or throws a <code>NoSuchCreativePermitException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching creative permit
	 * @throws NoSuchCreativePermitException if a matching creative permit could not be found
	 */
	public CreativePermit findBygetCreativePermitBy_CI(String caseId)
		throws NoSuchCreativePermitException;

	/**
	 * Returns the creative permit where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching creative permit, or <code>null</code> if a matching creative permit could not be found
	 */
	public CreativePermit fetchBygetCreativePermitBy_CI(String caseId);

	/**
	 * Returns the creative permit where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching creative permit, or <code>null</code> if a matching creative permit could not be found
	 */
	public CreativePermit fetchBygetCreativePermitBy_CI(
		String caseId, boolean useFinderCache);

	/**
	 * Removes the creative permit where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the creative permit that was removed
	 */
	public CreativePermit removeBygetCreativePermitBy_CI(String caseId)
		throws NoSuchCreativePermitException;

	/**
	 * Returns the number of creative permits where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching creative permits
	 */
	public int countBygetCreativePermitBy_CI(String caseId);

	/**
	 * Caches the creative permit in the entity cache if it is enabled.
	 *
	 * @param creativePermit the creative permit
	 */
	public void cacheResult(CreativePermit creativePermit);

	/**
	 * Caches the creative permits in the entity cache if it is enabled.
	 *
	 * @param creativePermits the creative permits
	 */
	public void cacheResult(java.util.List<CreativePermit> creativePermits);

	/**
	 * Creates a new creative permit with the primary key. Does not add the creative permit to the database.
	 *
	 * @param creativePermitId the primary key for the new creative permit
	 * @return the new creative permit
	 */
	public CreativePermit create(long creativePermitId);

	/**
	 * Removes the creative permit with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param creativePermitId the primary key of the creative permit
	 * @return the creative permit that was removed
	 * @throws NoSuchCreativePermitException if a creative permit with the primary key could not be found
	 */
	public CreativePermit remove(long creativePermitId)
		throws NoSuchCreativePermitException;

	public CreativePermit updateImpl(CreativePermit creativePermit);

	/**
	 * Returns the creative permit with the primary key or throws a <code>NoSuchCreativePermitException</code> if it could not be found.
	 *
	 * @param creativePermitId the primary key of the creative permit
	 * @return the creative permit
	 * @throws NoSuchCreativePermitException if a creative permit with the primary key could not be found
	 */
	public CreativePermit findByPrimaryKey(long creativePermitId)
		throws NoSuchCreativePermitException;

	/**
	 * Returns the creative permit with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param creativePermitId the primary key of the creative permit
	 * @return the creative permit, or <code>null</code> if a creative permit with the primary key could not be found
	 */
	public CreativePermit fetchByPrimaryKey(long creativePermitId);

	/**
	 * Returns all the creative permits.
	 *
	 * @return the creative permits
	 */
	public java.util.List<CreativePermit> findAll();

	/**
	 * Returns a range of all the creative permits.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativePermitModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of creative permits
	 * @param end the upper bound of the range of creative permits (not inclusive)
	 * @return the range of creative permits
	 */
	public java.util.List<CreativePermit> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the creative permits.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativePermitModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of creative permits
	 * @param end the upper bound of the range of creative permits (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of creative permits
	 */
	public java.util.List<CreativePermit> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CreativePermit>
			orderByComparator);

	/**
	 * Returns an ordered range of all the creative permits.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativePermitModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of creative permits
	 * @param end the upper bound of the range of creative permits (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of creative permits
	 */
	public java.util.List<CreativePermit> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CreativePermit>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the creative permits from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of creative permits.
	 *
	 * @return the number of creative permits
	 */
	public int countAll();

}