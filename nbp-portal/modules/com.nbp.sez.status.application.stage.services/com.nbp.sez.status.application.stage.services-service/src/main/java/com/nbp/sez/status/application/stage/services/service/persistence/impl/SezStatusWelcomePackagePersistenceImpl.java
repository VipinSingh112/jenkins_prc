/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.stage.services.service.persistence.impl;

import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.configuration.Configuration;
import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.SessionFactory;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.security.auth.CompanyThreadLocal;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextThreadLocal;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.uuid.PortalUUIDUtil;

import com.nbp.sez.status.application.stage.services.exception.NoSuchSezStatusWelcomePackageException;
import com.nbp.sez.status.application.stage.services.model.SezStatusWelcomePackage;
import com.nbp.sez.status.application.stage.services.model.SezStatusWelcomePackageTable;
import com.nbp.sez.status.application.stage.services.model.impl.SezStatusWelcomePackageImpl;
import com.nbp.sez.status.application.stage.services.model.impl.SezStatusWelcomePackageModelImpl;
import com.nbp.sez.status.application.stage.services.service.persistence.SezStatusWelcomePackagePersistence;
import com.nbp.sez.status.application.stage.services.service.persistence.SezStatusWelcomePackageUtil;
import com.nbp.sez.status.application.stage.services.service.persistence.impl.constants.SEZ_STATUS_STAGESPersistenceConstants;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * The persistence implementation for the sez status welcome package service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = SezStatusWelcomePackagePersistence.class)
public class SezStatusWelcomePackagePersistenceImpl
	extends BasePersistenceImpl<SezStatusWelcomePackage>
	implements SezStatusWelcomePackagePersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>SezStatusWelcomePackageUtil</code> to access the sez status welcome package persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		SezStatusWelcomePackageImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathWithPaginationFindByUuid;
	private FinderPath _finderPathWithoutPaginationFindByUuid;
	private FinderPath _finderPathCountByUuid;

	/**
	 * Returns all the sez status welcome packages where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching sez status welcome packages
	 */
	@Override
	public List<SezStatusWelcomePackage> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the sez status welcome packages where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusWelcomePackageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of sez status welcome packages
	 * @param end the upper bound of the range of sez status welcome packages (not inclusive)
	 * @return the range of matching sez status welcome packages
	 */
	@Override
	public List<SezStatusWelcomePackage> findByUuid(
		String uuid, int start, int end) {

		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the sez status welcome packages where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusWelcomePackageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of sez status welcome packages
	 * @param end the upper bound of the range of sez status welcome packages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching sez status welcome packages
	 */
	@Override
	public List<SezStatusWelcomePackage> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<SezStatusWelcomePackage> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the sez status welcome packages where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusWelcomePackageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of sez status welcome packages
	 * @param end the upper bound of the range of sez status welcome packages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching sez status welcome packages
	 */
	@Override
	public List<SezStatusWelcomePackage> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<SezStatusWelcomePackage> orderByComparator,
		boolean useFinderCache) {

		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByUuid;
				finderArgs = new Object[] {uuid};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByUuid;
			finderArgs = new Object[] {uuid, start, end, orderByComparator};
		}

		List<SezStatusWelcomePackage> list = null;

		if (useFinderCache) {
			list = (List<SezStatusWelcomePackage>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (SezStatusWelcomePackage sezStatusWelcomePackage : list) {
					if (!uuid.equals(sezStatusWelcomePackage.getUuid())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					3 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(3);
			}

			sb.append(_SQL_SELECT_SEZSTATUSWELCOMEPACKAGE_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(SezStatusWelcomePackageModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				list = (List<SezStatusWelcomePackage>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first sez status welcome package in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez status welcome package
	 * @throws NoSuchSezStatusWelcomePackageException if a matching sez status welcome package could not be found
	 */
	@Override
	public SezStatusWelcomePackage findByUuid_First(
			String uuid,
			OrderByComparator<SezStatusWelcomePackage> orderByComparator)
		throws NoSuchSezStatusWelcomePackageException {

		SezStatusWelcomePackage sezStatusWelcomePackage = fetchByUuid_First(
			uuid, orderByComparator);

		if (sezStatusWelcomePackage != null) {
			return sezStatusWelcomePackage;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchSezStatusWelcomePackageException(sb.toString());
	}

	/**
	 * Returns the first sez status welcome package in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez status welcome package, or <code>null</code> if a matching sez status welcome package could not be found
	 */
	@Override
	public SezStatusWelcomePackage fetchByUuid_First(
		String uuid,
		OrderByComparator<SezStatusWelcomePackage> orderByComparator) {

		List<SezStatusWelcomePackage> list = findByUuid(
			uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last sez status welcome package in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez status welcome package
	 * @throws NoSuchSezStatusWelcomePackageException if a matching sez status welcome package could not be found
	 */
	@Override
	public SezStatusWelcomePackage findByUuid_Last(
			String uuid,
			OrderByComparator<SezStatusWelcomePackage> orderByComparator)
		throws NoSuchSezStatusWelcomePackageException {

		SezStatusWelcomePackage sezStatusWelcomePackage = fetchByUuid_Last(
			uuid, orderByComparator);

		if (sezStatusWelcomePackage != null) {
			return sezStatusWelcomePackage;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchSezStatusWelcomePackageException(sb.toString());
	}

	/**
	 * Returns the last sez status welcome package in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez status welcome package, or <code>null</code> if a matching sez status welcome package could not be found
	 */
	@Override
	public SezStatusWelcomePackage fetchByUuid_Last(
		String uuid,
		OrderByComparator<SezStatusWelcomePackage> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<SezStatusWelcomePackage> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the sez status welcome packages before and after the current sez status welcome package in the ordered set where uuid = &#63;.
	 *
	 * @param sezStatusWelcomeId the primary key of the current sez status welcome package
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next sez status welcome package
	 * @throws NoSuchSezStatusWelcomePackageException if a sez status welcome package with the primary key could not be found
	 */
	@Override
	public SezStatusWelcomePackage[] findByUuid_PrevAndNext(
			long sezStatusWelcomeId, String uuid,
			OrderByComparator<SezStatusWelcomePackage> orderByComparator)
		throws NoSuchSezStatusWelcomePackageException {

		uuid = Objects.toString(uuid, "");

		SezStatusWelcomePackage sezStatusWelcomePackage = findByPrimaryKey(
			sezStatusWelcomeId);

		Session session = null;

		try {
			session = openSession();

			SezStatusWelcomePackage[] array =
				new SezStatusWelcomePackageImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, sezStatusWelcomePackage, uuid, orderByComparator,
				true);

			array[1] = sezStatusWelcomePackage;

			array[2] = getByUuid_PrevAndNext(
				session, sezStatusWelcomePackage, uuid, orderByComparator,
				false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected SezStatusWelcomePackage getByUuid_PrevAndNext(
		Session session, SezStatusWelcomePackage sezStatusWelcomePackage,
		String uuid,
		OrderByComparator<SezStatusWelcomePackage> orderByComparator,
		boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_SEZSTATUSWELCOMEPACKAGE_WHERE);

		boolean bindUuid = false;

		if (uuid.isEmpty()) {
			sb.append(_FINDER_COLUMN_UUID_UUID_3);
		}
		else {
			bindUuid = true;

			sb.append(_FINDER_COLUMN_UUID_UUID_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				sb.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						sb.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN);
					}
					else {
						sb.append(WHERE_LESSER_THAN);
					}
				}
			}

			sb.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						sb.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC);
					}
					else {
						sb.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			sb.append(SezStatusWelcomePackageModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindUuid) {
			queryPos.add(uuid);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						sezStatusWelcomePackage)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<SezStatusWelcomePackage> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the sez status welcome packages where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (SezStatusWelcomePackage sezStatusWelcomePackage :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(sezStatusWelcomePackage);
		}
	}

	/**
	 * Returns the number of sez status welcome packages where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching sez status welcome packages
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_SEZSTATUSWELCOMEPACKAGE_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_UUID_2 =
		"sezStatusWelcomePackage.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(sezStatusWelcomePackage.uuid IS NULL OR sezStatusWelcomePackage.uuid = '')";

	private FinderPath _finderPathFetchByUUID_G;
	private FinderPath _finderPathCountByUUID_G;

	/**
	 * Returns the sez status welcome package where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchSezStatusWelcomePackageException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching sez status welcome package
	 * @throws NoSuchSezStatusWelcomePackageException if a matching sez status welcome package could not be found
	 */
	@Override
	public SezStatusWelcomePackage findByUUID_G(String uuid, long groupId)
		throws NoSuchSezStatusWelcomePackageException {

		SezStatusWelcomePackage sezStatusWelcomePackage = fetchByUUID_G(
			uuid, groupId);

		if (sezStatusWelcomePackage == null) {
			StringBundler sb = new StringBundler(6);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("uuid=");
			sb.append(uuid);

			sb.append(", groupId=");
			sb.append(groupId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchSezStatusWelcomePackageException(sb.toString());
		}

		return sezStatusWelcomePackage;
	}

	/**
	 * Returns the sez status welcome package where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching sez status welcome package, or <code>null</code> if a matching sez status welcome package could not be found
	 */
	@Override
	public SezStatusWelcomePackage fetchByUUID_G(String uuid, long groupId) {
		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the sez status welcome package where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching sez status welcome package, or <code>null</code> if a matching sez status welcome package could not be found
	 */
	@Override
	public SezStatusWelcomePackage fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		uuid = Objects.toString(uuid, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {uuid, groupId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchByUUID_G, finderArgs, this);
		}

		if (result instanceof SezStatusWelcomePackage) {
			SezStatusWelcomePackage sezStatusWelcomePackage =
				(SezStatusWelcomePackage)result;

			if (!Objects.equals(uuid, sezStatusWelcomePackage.getUuid()) ||
				(groupId != sezStatusWelcomePackage.getGroupId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_SEZSTATUSWELCOMEPACKAGE_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_G_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_G_UUID_2);
			}

			sb.append(_FINDER_COLUMN_UUID_G_GROUPID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				queryPos.add(groupId);

				List<SezStatusWelcomePackage> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByUUID_G, finderArgs, list);
					}
				}
				else {
					SezStatusWelcomePackage sezStatusWelcomePackage = list.get(
						0);

					result = sezStatusWelcomePackage;

					cacheResult(sezStatusWelcomePackage);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		if (result instanceof List<?>) {
			return null;
		}
		else {
			return (SezStatusWelcomePackage)result;
		}
	}

	/**
	 * Removes the sez status welcome package where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the sez status welcome package that was removed
	 */
	@Override
	public SezStatusWelcomePackage removeByUUID_G(String uuid, long groupId)
		throws NoSuchSezStatusWelcomePackageException {

		SezStatusWelcomePackage sezStatusWelcomePackage = findByUUID_G(
			uuid, groupId);

		return remove(sezStatusWelcomePackage);
	}

	/**
	 * Returns the number of sez status welcome packages where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching sez status welcome packages
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUUID_G;

		Object[] finderArgs = new Object[] {uuid, groupId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_SEZSTATUSWELCOMEPACKAGE_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_G_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_G_UUID_2);
			}

			sb.append(_FINDER_COLUMN_UUID_G_GROUPID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				queryPos.add(groupId);

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_G_UUID_2 =
		"sezStatusWelcomePackage.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_G_UUID_3 =
		"(sezStatusWelcomePackage.uuid IS NULL OR sezStatusWelcomePackage.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 =
		"sezStatusWelcomePackage.groupId = ?";

	private FinderPath _finderPathWithPaginationFindByUuid_C;
	private FinderPath _finderPathWithoutPaginationFindByUuid_C;
	private FinderPath _finderPathCountByUuid_C;

	/**
	 * Returns all the sez status welcome packages where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching sez status welcome packages
	 */
	@Override
	public List<SezStatusWelcomePackage> findByUuid_C(
		String uuid, long companyId) {

		return findByUuid_C(
			uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the sez status welcome packages where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusWelcomePackageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of sez status welcome packages
	 * @param end the upper bound of the range of sez status welcome packages (not inclusive)
	 * @return the range of matching sez status welcome packages
	 */
	@Override
	public List<SezStatusWelcomePackage> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return findByUuid_C(uuid, companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the sez status welcome packages where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusWelcomePackageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of sez status welcome packages
	 * @param end the upper bound of the range of sez status welcome packages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching sez status welcome packages
	 */
	@Override
	public List<SezStatusWelcomePackage> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<SezStatusWelcomePackage> orderByComparator) {

		return findByUuid_C(
			uuid, companyId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the sez status welcome packages where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusWelcomePackageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of sez status welcome packages
	 * @param end the upper bound of the range of sez status welcome packages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching sez status welcome packages
	 */
	@Override
	public List<SezStatusWelcomePackage> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<SezStatusWelcomePackage> orderByComparator,
		boolean useFinderCache) {

		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByUuid_C;
				finderArgs = new Object[] {uuid, companyId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByUuid_C;
			finderArgs = new Object[] {
				uuid, companyId, start, end, orderByComparator
			};
		}

		List<SezStatusWelcomePackage> list = null;

		if (useFinderCache) {
			list = (List<SezStatusWelcomePackage>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (SezStatusWelcomePackage sezStatusWelcomePackage : list) {
					if (!uuid.equals(sezStatusWelcomePackage.getUuid()) ||
						(companyId != sezStatusWelcomePackage.getCompanyId())) {

						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					4 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(4);
			}

			sb.append(_SQL_SELECT_SEZSTATUSWELCOMEPACKAGE_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_C_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_C_UUID_2);
			}

			sb.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(SezStatusWelcomePackageModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				queryPos.add(companyId);

				list = (List<SezStatusWelcomePackage>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first sez status welcome package in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez status welcome package
	 * @throws NoSuchSezStatusWelcomePackageException if a matching sez status welcome package could not be found
	 */
	@Override
	public SezStatusWelcomePackage findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<SezStatusWelcomePackage> orderByComparator)
		throws NoSuchSezStatusWelcomePackageException {

		SezStatusWelcomePackage sezStatusWelcomePackage = fetchByUuid_C_First(
			uuid, companyId, orderByComparator);

		if (sezStatusWelcomePackage != null) {
			return sezStatusWelcomePackage;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchSezStatusWelcomePackageException(sb.toString());
	}

	/**
	 * Returns the first sez status welcome package in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez status welcome package, or <code>null</code> if a matching sez status welcome package could not be found
	 */
	@Override
	public SezStatusWelcomePackage fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<SezStatusWelcomePackage> orderByComparator) {

		List<SezStatusWelcomePackage> list = findByUuid_C(
			uuid, companyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last sez status welcome package in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez status welcome package
	 * @throws NoSuchSezStatusWelcomePackageException if a matching sez status welcome package could not be found
	 */
	@Override
	public SezStatusWelcomePackage findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<SezStatusWelcomePackage> orderByComparator)
		throws NoSuchSezStatusWelcomePackageException {

		SezStatusWelcomePackage sezStatusWelcomePackage = fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);

		if (sezStatusWelcomePackage != null) {
			return sezStatusWelcomePackage;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchSezStatusWelcomePackageException(sb.toString());
	}

	/**
	 * Returns the last sez status welcome package in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez status welcome package, or <code>null</code> if a matching sez status welcome package could not be found
	 */
	@Override
	public SezStatusWelcomePackage fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<SezStatusWelcomePackage> orderByComparator) {

		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<SezStatusWelcomePackage> list = findByUuid_C(
			uuid, companyId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the sez status welcome packages before and after the current sez status welcome package in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param sezStatusWelcomeId the primary key of the current sez status welcome package
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next sez status welcome package
	 * @throws NoSuchSezStatusWelcomePackageException if a sez status welcome package with the primary key could not be found
	 */
	@Override
	public SezStatusWelcomePackage[] findByUuid_C_PrevAndNext(
			long sezStatusWelcomeId, String uuid, long companyId,
			OrderByComparator<SezStatusWelcomePackage> orderByComparator)
		throws NoSuchSezStatusWelcomePackageException {

		uuid = Objects.toString(uuid, "");

		SezStatusWelcomePackage sezStatusWelcomePackage = findByPrimaryKey(
			sezStatusWelcomeId);

		Session session = null;

		try {
			session = openSession();

			SezStatusWelcomePackage[] array =
				new SezStatusWelcomePackageImpl[3];

			array[0] = getByUuid_C_PrevAndNext(
				session, sezStatusWelcomePackage, uuid, companyId,
				orderByComparator, true);

			array[1] = sezStatusWelcomePackage;

			array[2] = getByUuid_C_PrevAndNext(
				session, sezStatusWelcomePackage, uuid, companyId,
				orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected SezStatusWelcomePackage getByUuid_C_PrevAndNext(
		Session session, SezStatusWelcomePackage sezStatusWelcomePackage,
		String uuid, long companyId,
		OrderByComparator<SezStatusWelcomePackage> orderByComparator,
		boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				5 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(4);
		}

		sb.append(_SQL_SELECT_SEZSTATUSWELCOMEPACKAGE_WHERE);

		boolean bindUuid = false;

		if (uuid.isEmpty()) {
			sb.append(_FINDER_COLUMN_UUID_C_UUID_3);
		}
		else {
			bindUuid = true;

			sb.append(_FINDER_COLUMN_UUID_C_UUID_2);
		}

		sb.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				sb.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						sb.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN);
					}
					else {
						sb.append(WHERE_LESSER_THAN);
					}
				}
			}

			sb.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						sb.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC);
					}
					else {
						sb.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			sb.append(SezStatusWelcomePackageModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindUuid) {
			queryPos.add(uuid);
		}

		queryPos.add(companyId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						sezStatusWelcomePackage)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<SezStatusWelcomePackage> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the sez status welcome packages where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (SezStatusWelcomePackage sezStatusWelcomePackage :
				findByUuid_C(
					uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(sezStatusWelcomePackage);
		}
	}

	/**
	 * Returns the number of sez status welcome packages where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching sez status welcome packages
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid_C;

		Object[] finderArgs = new Object[] {uuid, companyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_SEZSTATUSWELCOMEPACKAGE_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_C_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_C_UUID_2);
			}

			sb.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				queryPos.add(companyId);

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_C_UUID_2 =
		"sezStatusWelcomePackage.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_C_UUID_3 =
		"(sezStatusWelcomePackage.uuid IS NULL OR sezStatusWelcomePackage.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 =
		"sezStatusWelcomePackage.companyId = ?";

	private FinderPath _finderPathFetchBygetSezStatus_Welcome_Package_By_CI;
	private FinderPath _finderPathCountBygetSezStatus_Welcome_Package_By_CI;

	/**
	 * Returns the sez status welcome package where caseId = &#63; or throws a <code>NoSuchSezStatusWelcomePackageException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching sez status welcome package
	 * @throws NoSuchSezStatusWelcomePackageException if a matching sez status welcome package could not be found
	 */
	@Override
	public SezStatusWelcomePackage findBygetSezStatus_Welcome_Package_By_CI(
			String caseId)
		throws NoSuchSezStatusWelcomePackageException {

		SezStatusWelcomePackage sezStatusWelcomePackage =
			fetchBygetSezStatus_Welcome_Package_By_CI(caseId);

		if (sezStatusWelcomePackage == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("caseId=");
			sb.append(caseId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchSezStatusWelcomePackageException(sb.toString());
		}

		return sezStatusWelcomePackage;
	}

	/**
	 * Returns the sez status welcome package where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching sez status welcome package, or <code>null</code> if a matching sez status welcome package could not be found
	 */
	@Override
	public SezStatusWelcomePackage fetchBygetSezStatus_Welcome_Package_By_CI(
		String caseId) {

		return fetchBygetSezStatus_Welcome_Package_By_CI(caseId, true);
	}

	/**
	 * Returns the sez status welcome package where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching sez status welcome package, or <code>null</code> if a matching sez status welcome package could not be found
	 */
	@Override
	public SezStatusWelcomePackage fetchBygetSezStatus_Welcome_Package_By_CI(
		String caseId, boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {caseId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetSezStatus_Welcome_Package_By_CI,
				finderArgs, this);
		}

		if (result instanceof SezStatusWelcomePackage) {
			SezStatusWelcomePackage sezStatusWelcomePackage =
				(SezStatusWelcomePackage)result;

			if (!Objects.equals(caseId, sezStatusWelcomePackage.getCaseId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_SEZSTATUSWELCOMEPACKAGE_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETSEZSTATUS_WELCOME_PACKAGE_BY_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(
					_FINDER_COLUMN_GETSEZSTATUS_WELCOME_PACKAGE_BY_CI_CASEID_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindCaseId) {
					queryPos.add(caseId);
				}

				List<SezStatusWelcomePackage> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetSezStatus_Welcome_Package_By_CI,
							finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {caseId};
							}

							_log.warn(
								"SezStatusWelcomePackagePersistenceImpl.fetchBygetSezStatus_Welcome_Package_By_CI(String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					SezStatusWelcomePackage sezStatusWelcomePackage = list.get(
						0);

					result = sezStatusWelcomePackage;

					cacheResult(sezStatusWelcomePackage);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		if (result instanceof List<?>) {
			return null;
		}
		else {
			return (SezStatusWelcomePackage)result;
		}
	}

	/**
	 * Removes the sez status welcome package where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the sez status welcome package that was removed
	 */
	@Override
	public SezStatusWelcomePackage removeBygetSezStatus_Welcome_Package_By_CI(
			String caseId)
		throws NoSuchSezStatusWelcomePackageException {

		SezStatusWelcomePackage sezStatusWelcomePackage =
			findBygetSezStatus_Welcome_Package_By_CI(caseId);

		return remove(sezStatusWelcomePackage);
	}

	/**
	 * Returns the number of sez status welcome packages where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching sez status welcome packages
	 */
	@Override
	public int countBygetSezStatus_Welcome_Package_By_CI(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath =
			_finderPathCountBygetSezStatus_Welcome_Package_By_CI;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_SEZSTATUSWELCOMEPACKAGE_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETSEZSTATUS_WELCOME_PACKAGE_BY_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(
					_FINDER_COLUMN_GETSEZSTATUS_WELCOME_PACKAGE_BY_CI_CASEID_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindCaseId) {
					queryPos.add(caseId);
				}

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String
		_FINDER_COLUMN_GETSEZSTATUS_WELCOME_PACKAGE_BY_CI_CASEID_2 =
			"sezStatusWelcomePackage.caseId = ?";

	private static final String
		_FINDER_COLUMN_GETSEZSTATUS_WELCOME_PACKAGE_BY_CI_CASEID_3 =
			"(sezStatusWelcomePackage.caseId IS NULL OR sezStatusWelcomePackage.caseId = '')";

	public SezStatusWelcomePackagePersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");

		setDBColumnNames(dbColumnNames);

		setModelClass(SezStatusWelcomePackage.class);

		setModelImplClass(SezStatusWelcomePackageImpl.class);
		setModelPKClass(long.class);

		setTable(SezStatusWelcomePackageTable.INSTANCE);
	}

	/**
	 * Caches the sez status welcome package in the entity cache if it is enabled.
	 *
	 * @param sezStatusWelcomePackage the sez status welcome package
	 */
	@Override
	public void cacheResult(SezStatusWelcomePackage sezStatusWelcomePackage) {
		entityCache.putResult(
			SezStatusWelcomePackageImpl.class,
			sezStatusWelcomePackage.getPrimaryKey(), sezStatusWelcomePackage);

		finderCache.putResult(
			_finderPathFetchByUUID_G,
			new Object[] {
				sezStatusWelcomePackage.getUuid(),
				sezStatusWelcomePackage.getGroupId()
			},
			sezStatusWelcomePackage);

		finderCache.putResult(
			_finderPathFetchBygetSezStatus_Welcome_Package_By_CI,
			new Object[] {sezStatusWelcomePackage.getCaseId()},
			sezStatusWelcomePackage);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the sez status welcome packages in the entity cache if it is enabled.
	 *
	 * @param sezStatusWelcomePackages the sez status welcome packages
	 */
	@Override
	public void cacheResult(
		List<SezStatusWelcomePackage> sezStatusWelcomePackages) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (sezStatusWelcomePackages.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (SezStatusWelcomePackage sezStatusWelcomePackage :
				sezStatusWelcomePackages) {

			if (entityCache.getResult(
					SezStatusWelcomePackageImpl.class,
					sezStatusWelcomePackage.getPrimaryKey()) == null) {

				cacheResult(sezStatusWelcomePackage);
			}
		}
	}

	/**
	 * Clears the cache for all sez status welcome packages.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(SezStatusWelcomePackageImpl.class);

		finderCache.clearCache(SezStatusWelcomePackageImpl.class);
	}

	/**
	 * Clears the cache for the sez status welcome package.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(SezStatusWelcomePackage sezStatusWelcomePackage) {
		entityCache.removeResult(
			SezStatusWelcomePackageImpl.class, sezStatusWelcomePackage);
	}

	@Override
	public void clearCache(
		List<SezStatusWelcomePackage> sezStatusWelcomePackages) {

		for (SezStatusWelcomePackage sezStatusWelcomePackage :
				sezStatusWelcomePackages) {

			entityCache.removeResult(
				SezStatusWelcomePackageImpl.class, sezStatusWelcomePackage);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(SezStatusWelcomePackageImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				SezStatusWelcomePackageImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		SezStatusWelcomePackageModelImpl sezStatusWelcomePackageModelImpl) {

		Object[] args = new Object[] {
			sezStatusWelcomePackageModelImpl.getUuid(),
			sezStatusWelcomePackageModelImpl.getGroupId()
		};

		finderCache.putResult(_finderPathCountByUUID_G, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchByUUID_G, args, sezStatusWelcomePackageModelImpl);

		args = new Object[] {sezStatusWelcomePackageModelImpl.getCaseId()};

		finderCache.putResult(
			_finderPathCountBygetSezStatus_Welcome_Package_By_CI, args,
			Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetSezStatus_Welcome_Package_By_CI, args,
			sezStatusWelcomePackageModelImpl);
	}

	/**
	 * Creates a new sez status welcome package with the primary key. Does not add the sez status welcome package to the database.
	 *
	 * @param sezStatusWelcomeId the primary key for the new sez status welcome package
	 * @return the new sez status welcome package
	 */
	@Override
	public SezStatusWelcomePackage create(long sezStatusWelcomeId) {
		SezStatusWelcomePackage sezStatusWelcomePackage =
			new SezStatusWelcomePackageImpl();

		sezStatusWelcomePackage.setNew(true);
		sezStatusWelcomePackage.setPrimaryKey(sezStatusWelcomeId);

		String uuid = PortalUUIDUtil.generate();

		sezStatusWelcomePackage.setUuid(uuid);

		sezStatusWelcomePackage.setCompanyId(CompanyThreadLocal.getCompanyId());

		return sezStatusWelcomePackage;
	}

	/**
	 * Removes the sez status welcome package with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sezStatusWelcomeId the primary key of the sez status welcome package
	 * @return the sez status welcome package that was removed
	 * @throws NoSuchSezStatusWelcomePackageException if a sez status welcome package with the primary key could not be found
	 */
	@Override
	public SezStatusWelcomePackage remove(long sezStatusWelcomeId)
		throws NoSuchSezStatusWelcomePackageException {

		return remove((Serializable)sezStatusWelcomeId);
	}

	/**
	 * Removes the sez status welcome package with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the sez status welcome package
	 * @return the sez status welcome package that was removed
	 * @throws NoSuchSezStatusWelcomePackageException if a sez status welcome package with the primary key could not be found
	 */
	@Override
	public SezStatusWelcomePackage remove(Serializable primaryKey)
		throws NoSuchSezStatusWelcomePackageException {

		Session session = null;

		try {
			session = openSession();

			SezStatusWelcomePackage sezStatusWelcomePackage =
				(SezStatusWelcomePackage)session.get(
					SezStatusWelcomePackageImpl.class, primaryKey);

			if (sezStatusWelcomePackage == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchSezStatusWelcomePackageException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(sezStatusWelcomePackage);
		}
		catch (NoSuchSezStatusWelcomePackageException noSuchEntityException) {
			throw noSuchEntityException;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected SezStatusWelcomePackage removeImpl(
		SezStatusWelcomePackage sezStatusWelcomePackage) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(sezStatusWelcomePackage)) {
				sezStatusWelcomePackage = (SezStatusWelcomePackage)session.get(
					SezStatusWelcomePackageImpl.class,
					sezStatusWelcomePackage.getPrimaryKeyObj());
			}

			if (sezStatusWelcomePackage != null) {
				session.delete(sezStatusWelcomePackage);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (sezStatusWelcomePackage != null) {
			clearCache(sezStatusWelcomePackage);
		}

		return sezStatusWelcomePackage;
	}

	@Override
	public SezStatusWelcomePackage updateImpl(
		SezStatusWelcomePackage sezStatusWelcomePackage) {

		boolean isNew = sezStatusWelcomePackage.isNew();

		if (!(sezStatusWelcomePackage instanceof
				SezStatusWelcomePackageModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(sezStatusWelcomePackage.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					sezStatusWelcomePackage);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in sezStatusWelcomePackage proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom SezStatusWelcomePackage implementation " +
					sezStatusWelcomePackage.getClass());
		}

		SezStatusWelcomePackageModelImpl sezStatusWelcomePackageModelImpl =
			(SezStatusWelcomePackageModelImpl)sezStatusWelcomePackage;

		if (Validator.isNull(sezStatusWelcomePackage.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			sezStatusWelcomePackage.setUuid(uuid);
		}

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (sezStatusWelcomePackage.getCreateDate() == null)) {
			if (serviceContext == null) {
				sezStatusWelcomePackage.setCreateDate(date);
			}
			else {
				sezStatusWelcomePackage.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!sezStatusWelcomePackageModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				sezStatusWelcomePackage.setModifiedDate(date);
			}
			else {
				sezStatusWelcomePackage.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(sezStatusWelcomePackage);
			}
			else {
				sezStatusWelcomePackage =
					(SezStatusWelcomePackage)session.merge(
						sezStatusWelcomePackage);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			SezStatusWelcomePackageImpl.class, sezStatusWelcomePackageModelImpl,
			false, true);

		cacheUniqueFindersCache(sezStatusWelcomePackageModelImpl);

		if (isNew) {
			sezStatusWelcomePackage.setNew(false);
		}

		sezStatusWelcomePackage.resetOriginalValues();

		return sezStatusWelcomePackage;
	}

	/**
	 * Returns the sez status welcome package with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the sez status welcome package
	 * @return the sez status welcome package
	 * @throws NoSuchSezStatusWelcomePackageException if a sez status welcome package with the primary key could not be found
	 */
	@Override
	public SezStatusWelcomePackage findByPrimaryKey(Serializable primaryKey)
		throws NoSuchSezStatusWelcomePackageException {

		SezStatusWelcomePackage sezStatusWelcomePackage = fetchByPrimaryKey(
			primaryKey);

		if (sezStatusWelcomePackage == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchSezStatusWelcomePackageException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return sezStatusWelcomePackage;
	}

	/**
	 * Returns the sez status welcome package with the primary key or throws a <code>NoSuchSezStatusWelcomePackageException</code> if it could not be found.
	 *
	 * @param sezStatusWelcomeId the primary key of the sez status welcome package
	 * @return the sez status welcome package
	 * @throws NoSuchSezStatusWelcomePackageException if a sez status welcome package with the primary key could not be found
	 */
	@Override
	public SezStatusWelcomePackage findByPrimaryKey(long sezStatusWelcomeId)
		throws NoSuchSezStatusWelcomePackageException {

		return findByPrimaryKey((Serializable)sezStatusWelcomeId);
	}

	/**
	 * Returns the sez status welcome package with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sezStatusWelcomeId the primary key of the sez status welcome package
	 * @return the sez status welcome package, or <code>null</code> if a sez status welcome package with the primary key could not be found
	 */
	@Override
	public SezStatusWelcomePackage fetchByPrimaryKey(long sezStatusWelcomeId) {
		return fetchByPrimaryKey((Serializable)sezStatusWelcomeId);
	}

	/**
	 * Returns all the sez status welcome packages.
	 *
	 * @return the sez status welcome packages
	 */
	@Override
	public List<SezStatusWelcomePackage> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the sez status welcome packages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusWelcomePackageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez status welcome packages
	 * @param end the upper bound of the range of sez status welcome packages (not inclusive)
	 * @return the range of sez status welcome packages
	 */
	@Override
	public List<SezStatusWelcomePackage> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the sez status welcome packages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusWelcomePackageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez status welcome packages
	 * @param end the upper bound of the range of sez status welcome packages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of sez status welcome packages
	 */
	@Override
	public List<SezStatusWelcomePackage> findAll(
		int start, int end,
		OrderByComparator<SezStatusWelcomePackage> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the sez status welcome packages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusWelcomePackageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez status welcome packages
	 * @param end the upper bound of the range of sez status welcome packages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of sez status welcome packages
	 */
	@Override
	public List<SezStatusWelcomePackage> findAll(
		int start, int end,
		OrderByComparator<SezStatusWelcomePackage> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindAll;
				finderArgs = FINDER_ARGS_EMPTY;
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindAll;
			finderArgs = new Object[] {start, end, orderByComparator};
		}

		List<SezStatusWelcomePackage> list = null;

		if (useFinderCache) {
			list = (List<SezStatusWelcomePackage>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_SEZSTATUSWELCOMEPACKAGE);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_SEZSTATUSWELCOMEPACKAGE;

				sql = sql.concat(
					SezStatusWelcomePackageModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<SezStatusWelcomePackage>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the sez status welcome packages from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (SezStatusWelcomePackage sezStatusWelcomePackage : findAll()) {
			remove(sezStatusWelcomePackage);
		}
	}

	/**
	 * Returns the number of sez status welcome packages.
	 *
	 * @return the number of sez status welcome packages
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(
					_SQL_COUNT_SEZSTATUSWELCOMEPACKAGE);

				count = (Long)query.uniqueResult();

				finderCache.putResult(
					_finderPathCountAll, FINDER_ARGS_EMPTY, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	public Set<String> getBadColumnNames() {
		return _badColumnNames;
	}

	@Override
	protected EntityCache getEntityCache() {
		return entityCache;
	}

	@Override
	protected String getPKDBName() {
		return "sezStatusWelcomeId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_SEZSTATUSWELCOMEPACKAGE;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return SezStatusWelcomePackageModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the sez status welcome package persistence.
	 */
	@Activate
	public void activate() {
		_valueObjectFinderCacheListThreshold = GetterUtil.getInteger(
			PropsUtil.get(PropsKeys.VALUE_OBJECT_FINDER_CACHE_LIST_THRESHOLD));

		_finderPathWithPaginationFindAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0],
			new String[0], true);

		_finderPathWithoutPaginationFindAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0],
			new String[0], true);

		_finderPathCountAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0], new String[0], false);

		_finderPathWithPaginationFindByUuid = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"uuid_"}, true);

		_finderPathWithoutPaginationFindByUuid = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid",
			new String[] {String.class.getName()}, new String[] {"uuid_"},
			true);

		_finderPathCountByUuid = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid",
			new String[] {String.class.getName()}, new String[] {"uuid_"},
			false);

		_finderPathFetchByUUID_G = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchByUUID_G",
			new String[] {String.class.getName(), Long.class.getName()},
			new String[] {"uuid_", "groupId"}, true);

		_finderPathCountByUUID_G = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUUID_G",
			new String[] {String.class.getName(), Long.class.getName()},
			new String[] {"uuid_", "groupId"}, false);

		_finderPathWithPaginationFindByUuid_C = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid_C",
			new String[] {
				String.class.getName(), Long.class.getName(),
				Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			},
			new String[] {"uuid_", "companyId"}, true);

		_finderPathWithoutPaginationFindByUuid_C = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid_C",
			new String[] {String.class.getName(), Long.class.getName()},
			new String[] {"uuid_", "companyId"}, true);

		_finderPathCountByUuid_C = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid_C",
			new String[] {String.class.getName(), Long.class.getName()},
			new String[] {"uuid_", "companyId"}, false);

		_finderPathFetchBygetSezStatus_Welcome_Package_By_CI = new FinderPath(
			FINDER_CLASS_NAME_ENTITY,
			"fetchBygetSezStatus_Welcome_Package_By_CI",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			true);

		_finderPathCountBygetSezStatus_Welcome_Package_By_CI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetSezStatus_Welcome_Package_By_CI",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			false);

		SezStatusWelcomePackageUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		SezStatusWelcomePackageUtil.setPersistence(null);

		entityCache.removeCache(SezStatusWelcomePackageImpl.class.getName());
	}

	@Override
	@Reference(
		target = SEZ_STATUS_STAGESPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = SEZ_STATUS_STAGESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = SEZ_STATUS_STAGESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_SEZSTATUSWELCOMEPACKAGE =
		"SELECT sezStatusWelcomePackage FROM SezStatusWelcomePackage sezStatusWelcomePackage";

	private static final String _SQL_SELECT_SEZSTATUSWELCOMEPACKAGE_WHERE =
		"SELECT sezStatusWelcomePackage FROM SezStatusWelcomePackage sezStatusWelcomePackage WHERE ";

	private static final String _SQL_COUNT_SEZSTATUSWELCOMEPACKAGE =
		"SELECT COUNT(sezStatusWelcomePackage) FROM SezStatusWelcomePackage sezStatusWelcomePackage";

	private static final String _SQL_COUNT_SEZSTATUSWELCOMEPACKAGE_WHERE =
		"SELECT COUNT(sezStatusWelcomePackage) FROM SezStatusWelcomePackage sezStatusWelcomePackage WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"sezStatusWelcomePackage.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No SezStatusWelcomePackage exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No SezStatusWelcomePackage exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		SezStatusWelcomePackagePersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}