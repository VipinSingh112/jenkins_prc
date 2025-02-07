/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.application.form.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.osi.application.form.services.exception.NoSuchOfficialUseException;
import com.nbp.osi.application.form.services.model.OfficialUse;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the official use service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OfficialUseUtil
 * @generated
 */
@ProviderType
public interface OfficialUsePersistence extends BasePersistence<OfficialUse> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link OfficialUseUtil} to access the official use persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the official use where osiApplicationId = &#63; or throws a <code>NoSuchOfficialUseException</code> if it could not be found.
	 *
	 * @param osiApplicationId the osi application ID
	 * @return the matching official use
	 * @throws NoSuchOfficialUseException if a matching official use could not be found
	 */
	public OfficialUse findBygetOsiById(long osiApplicationId)
		throws NoSuchOfficialUseException;

	/**
	 * Returns the official use where osiApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param osiApplicationId the osi application ID
	 * @return the matching official use, or <code>null</code> if a matching official use could not be found
	 */
	public OfficialUse fetchBygetOsiById(long osiApplicationId);

	/**
	 * Returns the official use where osiApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param osiApplicationId the osi application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching official use, or <code>null</code> if a matching official use could not be found
	 */
	public OfficialUse fetchBygetOsiById(
		long osiApplicationId, boolean useFinderCache);

	/**
	 * Removes the official use where osiApplicationId = &#63; from the database.
	 *
	 * @param osiApplicationId the osi application ID
	 * @return the official use that was removed
	 */
	public OfficialUse removeBygetOsiById(long osiApplicationId)
		throws NoSuchOfficialUseException;

	/**
	 * Returns the number of official uses where osiApplicationId = &#63;.
	 *
	 * @param osiApplicationId the osi application ID
	 * @return the number of matching official uses
	 */
	public int countBygetOsiById(long osiApplicationId);

	/**
	 * Caches the official use in the entity cache if it is enabled.
	 *
	 * @param officialUse the official use
	 */
	public void cacheResult(OfficialUse officialUse);

	/**
	 * Caches the official uses in the entity cache if it is enabled.
	 *
	 * @param officialUses the official uses
	 */
	public void cacheResult(java.util.List<OfficialUse> officialUses);

	/**
	 * Creates a new official use with the primary key. Does not add the official use to the database.
	 *
	 * @param officialUseId the primary key for the new official use
	 * @return the new official use
	 */
	public OfficialUse create(long officialUseId);

	/**
	 * Removes the official use with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param officialUseId the primary key of the official use
	 * @return the official use that was removed
	 * @throws NoSuchOfficialUseException if a official use with the primary key could not be found
	 */
	public OfficialUse remove(long officialUseId)
		throws NoSuchOfficialUseException;

	public OfficialUse updateImpl(OfficialUse officialUse);

	/**
	 * Returns the official use with the primary key or throws a <code>NoSuchOfficialUseException</code> if it could not be found.
	 *
	 * @param officialUseId the primary key of the official use
	 * @return the official use
	 * @throws NoSuchOfficialUseException if a official use with the primary key could not be found
	 */
	public OfficialUse findByPrimaryKey(long officialUseId)
		throws NoSuchOfficialUseException;

	/**
	 * Returns the official use with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param officialUseId the primary key of the official use
	 * @return the official use, or <code>null</code> if a official use with the primary key could not be found
	 */
	public OfficialUse fetchByPrimaryKey(long officialUseId);

	/**
	 * Returns all the official uses.
	 *
	 * @return the official uses
	 */
	public java.util.List<OfficialUse> findAll();

	/**
	 * Returns a range of all the official uses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OfficialUseModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of official uses
	 * @param end the upper bound of the range of official uses (not inclusive)
	 * @return the range of official uses
	 */
	public java.util.List<OfficialUse> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the official uses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OfficialUseModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of official uses
	 * @param end the upper bound of the range of official uses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of official uses
	 */
	public java.util.List<OfficialUse> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<OfficialUse>
			orderByComparator);

	/**
	 * Returns an ordered range of all the official uses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OfficialUseModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of official uses
	 * @param end the upper bound of the range of official uses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of official uses
	 */
	public java.util.List<OfficialUse> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<OfficialUse>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the official uses from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of official uses.
	 *
	 * @return the number of official uses
	 */
	public int countAll();

}