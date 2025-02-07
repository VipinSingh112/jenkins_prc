/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.service.persistence.impl;

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

import com.nbp.jtb.application.form.service.exception.NoSuchAccoGenDeclarationException;
import com.nbp.jtb.application.form.service.model.AccoGenDeclaration;
import com.nbp.jtb.application.form.service.model.AccoGenDeclarationTable;
import com.nbp.jtb.application.form.service.model.impl.AccoGenDeclarationImpl;
import com.nbp.jtb.application.form.service.model.impl.AccoGenDeclarationModelImpl;
import com.nbp.jtb.application.form.service.service.persistence.AccoGenDeclarationPersistence;
import com.nbp.jtb.application.form.service.service.persistence.AccoGenDeclarationUtil;
import com.nbp.jtb.application.form.service.service.persistence.impl.constants.JTB_APPLICATION_FORMPersistenceConstants;

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
 * The persistence implementation for the acco gen declaration service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = AccoGenDeclarationPersistence.class)
public class AccoGenDeclarationPersistenceImpl
	extends BasePersistenceImpl<AccoGenDeclaration>
	implements AccoGenDeclarationPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>AccoGenDeclarationUtil</code> to access the acco gen declaration persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		AccoGenDeclarationImpl.class.getName();

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
	 * Returns all the acco gen declarations where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching acco gen declarations
	 */
	@Override
	public List<AccoGenDeclaration> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the acco gen declarations where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccoGenDeclarationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of acco gen declarations
	 * @param end the upper bound of the range of acco gen declarations (not inclusive)
	 * @return the range of matching acco gen declarations
	 */
	@Override
	public List<AccoGenDeclaration> findByUuid(
		String uuid, int start, int end) {

		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the acco gen declarations where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccoGenDeclarationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of acco gen declarations
	 * @param end the upper bound of the range of acco gen declarations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching acco gen declarations
	 */
	@Override
	public List<AccoGenDeclaration> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<AccoGenDeclaration> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the acco gen declarations where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccoGenDeclarationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of acco gen declarations
	 * @param end the upper bound of the range of acco gen declarations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching acco gen declarations
	 */
	@Override
	public List<AccoGenDeclaration> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<AccoGenDeclaration> orderByComparator,
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

		List<AccoGenDeclaration> list = null;

		if (useFinderCache) {
			list = (List<AccoGenDeclaration>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (AccoGenDeclaration accoGenDeclaration : list) {
					if (!uuid.equals(accoGenDeclaration.getUuid())) {
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

			sb.append(_SQL_SELECT_ACCOGENDECLARATION_WHERE);

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
				sb.append(AccoGenDeclarationModelImpl.ORDER_BY_JPQL);
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

				list = (List<AccoGenDeclaration>)QueryUtil.list(
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
	 * Returns the first acco gen declaration in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acco gen declaration
	 * @throws NoSuchAccoGenDeclarationException if a matching acco gen declaration could not be found
	 */
	@Override
	public AccoGenDeclaration findByUuid_First(
			String uuid,
			OrderByComparator<AccoGenDeclaration> orderByComparator)
		throws NoSuchAccoGenDeclarationException {

		AccoGenDeclaration accoGenDeclaration = fetchByUuid_First(
			uuid, orderByComparator);

		if (accoGenDeclaration != null) {
			return accoGenDeclaration;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchAccoGenDeclarationException(sb.toString());
	}

	/**
	 * Returns the first acco gen declaration in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acco gen declaration, or <code>null</code> if a matching acco gen declaration could not be found
	 */
	@Override
	public AccoGenDeclaration fetchByUuid_First(
		String uuid, OrderByComparator<AccoGenDeclaration> orderByComparator) {

		List<AccoGenDeclaration> list = findByUuid(
			uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last acco gen declaration in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acco gen declaration
	 * @throws NoSuchAccoGenDeclarationException if a matching acco gen declaration could not be found
	 */
	@Override
	public AccoGenDeclaration findByUuid_Last(
			String uuid,
			OrderByComparator<AccoGenDeclaration> orderByComparator)
		throws NoSuchAccoGenDeclarationException {

		AccoGenDeclaration accoGenDeclaration = fetchByUuid_Last(
			uuid, orderByComparator);

		if (accoGenDeclaration != null) {
			return accoGenDeclaration;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchAccoGenDeclarationException(sb.toString());
	}

	/**
	 * Returns the last acco gen declaration in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acco gen declaration, or <code>null</code> if a matching acco gen declaration could not be found
	 */
	@Override
	public AccoGenDeclaration fetchByUuid_Last(
		String uuid, OrderByComparator<AccoGenDeclaration> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<AccoGenDeclaration> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the acco gen declarations before and after the current acco gen declaration in the ordered set where uuid = &#63;.
	 *
	 * @param accoGenDeclarationId the primary key of the current acco gen declaration
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next acco gen declaration
	 * @throws NoSuchAccoGenDeclarationException if a acco gen declaration with the primary key could not be found
	 */
	@Override
	public AccoGenDeclaration[] findByUuid_PrevAndNext(
			long accoGenDeclarationId, String uuid,
			OrderByComparator<AccoGenDeclaration> orderByComparator)
		throws NoSuchAccoGenDeclarationException {

		uuid = Objects.toString(uuid, "");

		AccoGenDeclaration accoGenDeclaration = findByPrimaryKey(
			accoGenDeclarationId);

		Session session = null;

		try {
			session = openSession();

			AccoGenDeclaration[] array = new AccoGenDeclarationImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, accoGenDeclaration, uuid, orderByComparator, true);

			array[1] = accoGenDeclaration;

			array[2] = getByUuid_PrevAndNext(
				session, accoGenDeclaration, uuid, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected AccoGenDeclaration getByUuid_PrevAndNext(
		Session session, AccoGenDeclaration accoGenDeclaration, String uuid,
		OrderByComparator<AccoGenDeclaration> orderByComparator,
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

		sb.append(_SQL_SELECT_ACCOGENDECLARATION_WHERE);

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
			sb.append(AccoGenDeclarationModelImpl.ORDER_BY_JPQL);
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
						accoGenDeclaration)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<AccoGenDeclaration> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the acco gen declarations where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (AccoGenDeclaration accoGenDeclaration :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(accoGenDeclaration);
		}
	}

	/**
	 * Returns the number of acco gen declarations where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching acco gen declarations
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_ACCOGENDECLARATION_WHERE);

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
		"accoGenDeclaration.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(accoGenDeclaration.uuid IS NULL OR accoGenDeclaration.uuid = '')";

	private FinderPath _finderPathFetchByUUID_G;
	private FinderPath _finderPathCountByUUID_G;

	/**
	 * Returns the acco gen declaration where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchAccoGenDeclarationException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching acco gen declaration
	 * @throws NoSuchAccoGenDeclarationException if a matching acco gen declaration could not be found
	 */
	@Override
	public AccoGenDeclaration findByUUID_G(String uuid, long groupId)
		throws NoSuchAccoGenDeclarationException {

		AccoGenDeclaration accoGenDeclaration = fetchByUUID_G(uuid, groupId);

		if (accoGenDeclaration == null) {
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

			throw new NoSuchAccoGenDeclarationException(sb.toString());
		}

		return accoGenDeclaration;
	}

	/**
	 * Returns the acco gen declaration where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching acco gen declaration, or <code>null</code> if a matching acco gen declaration could not be found
	 */
	@Override
	public AccoGenDeclaration fetchByUUID_G(String uuid, long groupId) {
		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the acco gen declaration where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching acco gen declaration, or <code>null</code> if a matching acco gen declaration could not be found
	 */
	@Override
	public AccoGenDeclaration fetchByUUID_G(
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

		if (result instanceof AccoGenDeclaration) {
			AccoGenDeclaration accoGenDeclaration = (AccoGenDeclaration)result;

			if (!Objects.equals(uuid, accoGenDeclaration.getUuid()) ||
				(groupId != accoGenDeclaration.getGroupId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_ACCOGENDECLARATION_WHERE);

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

				List<AccoGenDeclaration> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByUUID_G, finderArgs, list);
					}
				}
				else {
					AccoGenDeclaration accoGenDeclaration = list.get(0);

					result = accoGenDeclaration;

					cacheResult(accoGenDeclaration);
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
			return (AccoGenDeclaration)result;
		}
	}

	/**
	 * Removes the acco gen declaration where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the acco gen declaration that was removed
	 */
	@Override
	public AccoGenDeclaration removeByUUID_G(String uuid, long groupId)
		throws NoSuchAccoGenDeclarationException {

		AccoGenDeclaration accoGenDeclaration = findByUUID_G(uuid, groupId);

		return remove(accoGenDeclaration);
	}

	/**
	 * Returns the number of acco gen declarations where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching acco gen declarations
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUUID_G;

		Object[] finderArgs = new Object[] {uuid, groupId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_ACCOGENDECLARATION_WHERE);

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
		"accoGenDeclaration.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_G_UUID_3 =
		"(accoGenDeclaration.uuid IS NULL OR accoGenDeclaration.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 =
		"accoGenDeclaration.groupId = ?";

	private FinderPath _finderPathWithPaginationFindByUuid_C;
	private FinderPath _finderPathWithoutPaginationFindByUuid_C;
	private FinderPath _finderPathCountByUuid_C;

	/**
	 * Returns all the acco gen declarations where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching acco gen declarations
	 */
	@Override
	public List<AccoGenDeclaration> findByUuid_C(String uuid, long companyId) {
		return findByUuid_C(
			uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the acco gen declarations where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccoGenDeclarationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of acco gen declarations
	 * @param end the upper bound of the range of acco gen declarations (not inclusive)
	 * @return the range of matching acco gen declarations
	 */
	@Override
	public List<AccoGenDeclaration> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return findByUuid_C(uuid, companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the acco gen declarations where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccoGenDeclarationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of acco gen declarations
	 * @param end the upper bound of the range of acco gen declarations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching acco gen declarations
	 */
	@Override
	public List<AccoGenDeclaration> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<AccoGenDeclaration> orderByComparator) {

		return findByUuid_C(
			uuid, companyId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the acco gen declarations where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccoGenDeclarationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of acco gen declarations
	 * @param end the upper bound of the range of acco gen declarations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching acco gen declarations
	 */
	@Override
	public List<AccoGenDeclaration> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<AccoGenDeclaration> orderByComparator,
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

		List<AccoGenDeclaration> list = null;

		if (useFinderCache) {
			list = (List<AccoGenDeclaration>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (AccoGenDeclaration accoGenDeclaration : list) {
					if (!uuid.equals(accoGenDeclaration.getUuid()) ||
						(companyId != accoGenDeclaration.getCompanyId())) {

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

			sb.append(_SQL_SELECT_ACCOGENDECLARATION_WHERE);

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
				sb.append(AccoGenDeclarationModelImpl.ORDER_BY_JPQL);
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

				list = (List<AccoGenDeclaration>)QueryUtil.list(
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
	 * Returns the first acco gen declaration in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acco gen declaration
	 * @throws NoSuchAccoGenDeclarationException if a matching acco gen declaration could not be found
	 */
	@Override
	public AccoGenDeclaration findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<AccoGenDeclaration> orderByComparator)
		throws NoSuchAccoGenDeclarationException {

		AccoGenDeclaration accoGenDeclaration = fetchByUuid_C_First(
			uuid, companyId, orderByComparator);

		if (accoGenDeclaration != null) {
			return accoGenDeclaration;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchAccoGenDeclarationException(sb.toString());
	}

	/**
	 * Returns the first acco gen declaration in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acco gen declaration, or <code>null</code> if a matching acco gen declaration could not be found
	 */
	@Override
	public AccoGenDeclaration fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<AccoGenDeclaration> orderByComparator) {

		List<AccoGenDeclaration> list = findByUuid_C(
			uuid, companyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last acco gen declaration in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acco gen declaration
	 * @throws NoSuchAccoGenDeclarationException if a matching acco gen declaration could not be found
	 */
	@Override
	public AccoGenDeclaration findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<AccoGenDeclaration> orderByComparator)
		throws NoSuchAccoGenDeclarationException {

		AccoGenDeclaration accoGenDeclaration = fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);

		if (accoGenDeclaration != null) {
			return accoGenDeclaration;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchAccoGenDeclarationException(sb.toString());
	}

	/**
	 * Returns the last acco gen declaration in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acco gen declaration, or <code>null</code> if a matching acco gen declaration could not be found
	 */
	@Override
	public AccoGenDeclaration fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<AccoGenDeclaration> orderByComparator) {

		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<AccoGenDeclaration> list = findByUuid_C(
			uuid, companyId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the acco gen declarations before and after the current acco gen declaration in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param accoGenDeclarationId the primary key of the current acco gen declaration
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next acco gen declaration
	 * @throws NoSuchAccoGenDeclarationException if a acco gen declaration with the primary key could not be found
	 */
	@Override
	public AccoGenDeclaration[] findByUuid_C_PrevAndNext(
			long accoGenDeclarationId, String uuid, long companyId,
			OrderByComparator<AccoGenDeclaration> orderByComparator)
		throws NoSuchAccoGenDeclarationException {

		uuid = Objects.toString(uuid, "");

		AccoGenDeclaration accoGenDeclaration = findByPrimaryKey(
			accoGenDeclarationId);

		Session session = null;

		try {
			session = openSession();

			AccoGenDeclaration[] array = new AccoGenDeclarationImpl[3];

			array[0] = getByUuid_C_PrevAndNext(
				session, accoGenDeclaration, uuid, companyId, orderByComparator,
				true);

			array[1] = accoGenDeclaration;

			array[2] = getByUuid_C_PrevAndNext(
				session, accoGenDeclaration, uuid, companyId, orderByComparator,
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

	protected AccoGenDeclaration getByUuid_C_PrevAndNext(
		Session session, AccoGenDeclaration accoGenDeclaration, String uuid,
		long companyId, OrderByComparator<AccoGenDeclaration> orderByComparator,
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

		sb.append(_SQL_SELECT_ACCOGENDECLARATION_WHERE);

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
			sb.append(AccoGenDeclarationModelImpl.ORDER_BY_JPQL);
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
						accoGenDeclaration)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<AccoGenDeclaration> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the acco gen declarations where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (AccoGenDeclaration accoGenDeclaration :
				findByUuid_C(
					uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(accoGenDeclaration);
		}
	}

	/**
	 * Returns the number of acco gen declarations where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching acco gen declarations
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid_C;

		Object[] finderArgs = new Object[] {uuid, companyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_ACCOGENDECLARATION_WHERE);

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
		"accoGenDeclaration.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_C_UUID_3 =
		"(accoGenDeclaration.uuid IS NULL OR accoGenDeclaration.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 =
		"accoGenDeclaration.companyId = ?";

	private FinderPath _finderPathFetchBygetJTB_ByApplicationId;
	private FinderPath _finderPathCountBygetJTB_ByApplicationId;

	/**
	 * Returns the acco gen declaration where jtbApplicationId = &#63; or throws a <code>NoSuchAccoGenDeclarationException</code> if it could not be found.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the matching acco gen declaration
	 * @throws NoSuchAccoGenDeclarationException if a matching acco gen declaration could not be found
	 */
	@Override
	public AccoGenDeclaration findBygetJTB_ByApplicationId(
			long jtbApplicationId)
		throws NoSuchAccoGenDeclarationException {

		AccoGenDeclaration accoGenDeclaration = fetchBygetJTB_ByApplicationId(
			jtbApplicationId);

		if (accoGenDeclaration == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("jtbApplicationId=");
			sb.append(jtbApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchAccoGenDeclarationException(sb.toString());
		}

		return accoGenDeclaration;
	}

	/**
	 * Returns the acco gen declaration where jtbApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the matching acco gen declaration, or <code>null</code> if a matching acco gen declaration could not be found
	 */
	@Override
	public AccoGenDeclaration fetchBygetJTB_ByApplicationId(
		long jtbApplicationId) {

		return fetchBygetJTB_ByApplicationId(jtbApplicationId, true);
	}

	/**
	 * Returns the acco gen declaration where jtbApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching acco gen declaration, or <code>null</code> if a matching acco gen declaration could not be found
	 */
	@Override
	public AccoGenDeclaration fetchBygetJTB_ByApplicationId(
		long jtbApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {jtbApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetJTB_ByApplicationId, finderArgs, this);
		}

		if (result instanceof AccoGenDeclaration) {
			AccoGenDeclaration accoGenDeclaration = (AccoGenDeclaration)result;

			if (jtbApplicationId != accoGenDeclaration.getJtbApplicationId()) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_ACCOGENDECLARATION_WHERE);

			sb.append(_FINDER_COLUMN_GETJTB_BYAPPLICATIONID_JTBAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(jtbApplicationId);

				List<AccoGenDeclaration> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetJTB_ByApplicationId,
							finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {jtbApplicationId};
							}

							_log.warn(
								"AccoGenDeclarationPersistenceImpl.fetchBygetJTB_ByApplicationId(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					AccoGenDeclaration accoGenDeclaration = list.get(0);

					result = accoGenDeclaration;

					cacheResult(accoGenDeclaration);
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
			return (AccoGenDeclaration)result;
		}
	}

	/**
	 * Removes the acco gen declaration where jtbApplicationId = &#63; from the database.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the acco gen declaration that was removed
	 */
	@Override
	public AccoGenDeclaration removeBygetJTB_ByApplicationId(
			long jtbApplicationId)
		throws NoSuchAccoGenDeclarationException {

		AccoGenDeclaration accoGenDeclaration = findBygetJTB_ByApplicationId(
			jtbApplicationId);

		return remove(accoGenDeclaration);
	}

	/**
	 * Returns the number of acco gen declarations where jtbApplicationId = &#63;.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the number of matching acco gen declarations
	 */
	@Override
	public int countBygetJTB_ByApplicationId(long jtbApplicationId) {
		FinderPath finderPath = _finderPathCountBygetJTB_ByApplicationId;

		Object[] finderArgs = new Object[] {jtbApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_ACCOGENDECLARATION_WHERE);

			sb.append(_FINDER_COLUMN_GETJTB_BYAPPLICATIONID_JTBAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(jtbApplicationId);

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
		_FINDER_COLUMN_GETJTB_BYAPPLICATIONID_JTBAPPLICATIONID_2 =
			"accoGenDeclaration.jtbApplicationId = ?";

	public AccoGenDeclarationPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");

		setDBColumnNames(dbColumnNames);

		setModelClass(AccoGenDeclaration.class);

		setModelImplClass(AccoGenDeclarationImpl.class);
		setModelPKClass(long.class);

		setTable(AccoGenDeclarationTable.INSTANCE);
	}

	/**
	 * Caches the acco gen declaration in the entity cache if it is enabled.
	 *
	 * @param accoGenDeclaration the acco gen declaration
	 */
	@Override
	public void cacheResult(AccoGenDeclaration accoGenDeclaration) {
		entityCache.putResult(
			AccoGenDeclarationImpl.class, accoGenDeclaration.getPrimaryKey(),
			accoGenDeclaration);

		finderCache.putResult(
			_finderPathFetchByUUID_G,
			new Object[] {
				accoGenDeclaration.getUuid(), accoGenDeclaration.getGroupId()
			},
			accoGenDeclaration);

		finderCache.putResult(
			_finderPathFetchBygetJTB_ByApplicationId,
			new Object[] {accoGenDeclaration.getJtbApplicationId()},
			accoGenDeclaration);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the acco gen declarations in the entity cache if it is enabled.
	 *
	 * @param accoGenDeclarations the acco gen declarations
	 */
	@Override
	public void cacheResult(List<AccoGenDeclaration> accoGenDeclarations) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (accoGenDeclarations.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (AccoGenDeclaration accoGenDeclaration : accoGenDeclarations) {
			if (entityCache.getResult(
					AccoGenDeclarationImpl.class,
					accoGenDeclaration.getPrimaryKey()) == null) {

				cacheResult(accoGenDeclaration);
			}
		}
	}

	/**
	 * Clears the cache for all acco gen declarations.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(AccoGenDeclarationImpl.class);

		finderCache.clearCache(AccoGenDeclarationImpl.class);
	}

	/**
	 * Clears the cache for the acco gen declaration.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(AccoGenDeclaration accoGenDeclaration) {
		entityCache.removeResult(
			AccoGenDeclarationImpl.class, accoGenDeclaration);
	}

	@Override
	public void clearCache(List<AccoGenDeclaration> accoGenDeclarations) {
		for (AccoGenDeclaration accoGenDeclaration : accoGenDeclarations) {
			entityCache.removeResult(
				AccoGenDeclarationImpl.class, accoGenDeclaration);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(AccoGenDeclarationImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(AccoGenDeclarationImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		AccoGenDeclarationModelImpl accoGenDeclarationModelImpl) {

		Object[] args = new Object[] {
			accoGenDeclarationModelImpl.getUuid(),
			accoGenDeclarationModelImpl.getGroupId()
		};

		finderCache.putResult(_finderPathCountByUUID_G, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchByUUID_G, args, accoGenDeclarationModelImpl);

		args = new Object[] {accoGenDeclarationModelImpl.getJtbApplicationId()};

		finderCache.putResult(
			_finderPathCountBygetJTB_ByApplicationId, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetJTB_ByApplicationId, args,
			accoGenDeclarationModelImpl);
	}

	/**
	 * Creates a new acco gen declaration with the primary key. Does not add the acco gen declaration to the database.
	 *
	 * @param accoGenDeclarationId the primary key for the new acco gen declaration
	 * @return the new acco gen declaration
	 */
	@Override
	public AccoGenDeclaration create(long accoGenDeclarationId) {
		AccoGenDeclaration accoGenDeclaration = new AccoGenDeclarationImpl();

		accoGenDeclaration.setNew(true);
		accoGenDeclaration.setPrimaryKey(accoGenDeclarationId);

		String uuid = PortalUUIDUtil.generate();

		accoGenDeclaration.setUuid(uuid);

		accoGenDeclaration.setCompanyId(CompanyThreadLocal.getCompanyId());

		return accoGenDeclaration;
	}

	/**
	 * Removes the acco gen declaration with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param accoGenDeclarationId the primary key of the acco gen declaration
	 * @return the acco gen declaration that was removed
	 * @throws NoSuchAccoGenDeclarationException if a acco gen declaration with the primary key could not be found
	 */
	@Override
	public AccoGenDeclaration remove(long accoGenDeclarationId)
		throws NoSuchAccoGenDeclarationException {

		return remove((Serializable)accoGenDeclarationId);
	}

	/**
	 * Removes the acco gen declaration with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the acco gen declaration
	 * @return the acco gen declaration that was removed
	 * @throws NoSuchAccoGenDeclarationException if a acco gen declaration with the primary key could not be found
	 */
	@Override
	public AccoGenDeclaration remove(Serializable primaryKey)
		throws NoSuchAccoGenDeclarationException {

		Session session = null;

		try {
			session = openSession();

			AccoGenDeclaration accoGenDeclaration =
				(AccoGenDeclaration)session.get(
					AccoGenDeclarationImpl.class, primaryKey);

			if (accoGenDeclaration == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchAccoGenDeclarationException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(accoGenDeclaration);
		}
		catch (NoSuchAccoGenDeclarationException noSuchEntityException) {
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
	protected AccoGenDeclaration removeImpl(
		AccoGenDeclaration accoGenDeclaration) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(accoGenDeclaration)) {
				accoGenDeclaration = (AccoGenDeclaration)session.get(
					AccoGenDeclarationImpl.class,
					accoGenDeclaration.getPrimaryKeyObj());
			}

			if (accoGenDeclaration != null) {
				session.delete(accoGenDeclaration);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (accoGenDeclaration != null) {
			clearCache(accoGenDeclaration);
		}

		return accoGenDeclaration;
	}

	@Override
	public AccoGenDeclaration updateImpl(
		AccoGenDeclaration accoGenDeclaration) {

		boolean isNew = accoGenDeclaration.isNew();

		if (!(accoGenDeclaration instanceof AccoGenDeclarationModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(accoGenDeclaration.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					accoGenDeclaration);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in accoGenDeclaration proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom AccoGenDeclaration implementation " +
					accoGenDeclaration.getClass());
		}

		AccoGenDeclarationModelImpl accoGenDeclarationModelImpl =
			(AccoGenDeclarationModelImpl)accoGenDeclaration;

		if (Validator.isNull(accoGenDeclaration.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			accoGenDeclaration.setUuid(uuid);
		}

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (accoGenDeclaration.getCreateDate() == null)) {
			if (serviceContext == null) {
				accoGenDeclaration.setCreateDate(date);
			}
			else {
				accoGenDeclaration.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!accoGenDeclarationModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				accoGenDeclaration.setModifiedDate(date);
			}
			else {
				accoGenDeclaration.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(accoGenDeclaration);
			}
			else {
				accoGenDeclaration = (AccoGenDeclaration)session.merge(
					accoGenDeclaration);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			AccoGenDeclarationImpl.class, accoGenDeclarationModelImpl, false,
			true);

		cacheUniqueFindersCache(accoGenDeclarationModelImpl);

		if (isNew) {
			accoGenDeclaration.setNew(false);
		}

		accoGenDeclaration.resetOriginalValues();

		return accoGenDeclaration;
	}

	/**
	 * Returns the acco gen declaration with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the acco gen declaration
	 * @return the acco gen declaration
	 * @throws NoSuchAccoGenDeclarationException if a acco gen declaration with the primary key could not be found
	 */
	@Override
	public AccoGenDeclaration findByPrimaryKey(Serializable primaryKey)
		throws NoSuchAccoGenDeclarationException {

		AccoGenDeclaration accoGenDeclaration = fetchByPrimaryKey(primaryKey);

		if (accoGenDeclaration == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchAccoGenDeclarationException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return accoGenDeclaration;
	}

	/**
	 * Returns the acco gen declaration with the primary key or throws a <code>NoSuchAccoGenDeclarationException</code> if it could not be found.
	 *
	 * @param accoGenDeclarationId the primary key of the acco gen declaration
	 * @return the acco gen declaration
	 * @throws NoSuchAccoGenDeclarationException if a acco gen declaration with the primary key could not be found
	 */
	@Override
	public AccoGenDeclaration findByPrimaryKey(long accoGenDeclarationId)
		throws NoSuchAccoGenDeclarationException {

		return findByPrimaryKey((Serializable)accoGenDeclarationId);
	}

	/**
	 * Returns the acco gen declaration with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param accoGenDeclarationId the primary key of the acco gen declaration
	 * @return the acco gen declaration, or <code>null</code> if a acco gen declaration with the primary key could not be found
	 */
	@Override
	public AccoGenDeclaration fetchByPrimaryKey(long accoGenDeclarationId) {
		return fetchByPrimaryKey((Serializable)accoGenDeclarationId);
	}

	/**
	 * Returns all the acco gen declarations.
	 *
	 * @return the acco gen declarations
	 */
	@Override
	public List<AccoGenDeclaration> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the acco gen declarations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccoGenDeclarationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acco gen declarations
	 * @param end the upper bound of the range of acco gen declarations (not inclusive)
	 * @return the range of acco gen declarations
	 */
	@Override
	public List<AccoGenDeclaration> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the acco gen declarations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccoGenDeclarationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acco gen declarations
	 * @param end the upper bound of the range of acco gen declarations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of acco gen declarations
	 */
	@Override
	public List<AccoGenDeclaration> findAll(
		int start, int end,
		OrderByComparator<AccoGenDeclaration> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the acco gen declarations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccoGenDeclarationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acco gen declarations
	 * @param end the upper bound of the range of acco gen declarations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of acco gen declarations
	 */
	@Override
	public List<AccoGenDeclaration> findAll(
		int start, int end,
		OrderByComparator<AccoGenDeclaration> orderByComparator,
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

		List<AccoGenDeclaration> list = null;

		if (useFinderCache) {
			list = (List<AccoGenDeclaration>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_ACCOGENDECLARATION);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_ACCOGENDECLARATION;

				sql = sql.concat(AccoGenDeclarationModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<AccoGenDeclaration>)QueryUtil.list(
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
	 * Removes all the acco gen declarations from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (AccoGenDeclaration accoGenDeclaration : findAll()) {
			remove(accoGenDeclaration);
		}
	}

	/**
	 * Returns the number of acco gen declarations.
	 *
	 * @return the number of acco gen declarations
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
					_SQL_COUNT_ACCOGENDECLARATION);

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
		return "accoGenDeclarationId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_ACCOGENDECLARATION;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return AccoGenDeclarationModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the acco gen declaration persistence.
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

		_finderPathFetchBygetJTB_ByApplicationId = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetJTB_ByApplicationId",
			new String[] {Long.class.getName()},
			new String[] {"jtbApplicationId"}, true);

		_finderPathCountBygetJTB_ByApplicationId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetJTB_ByApplicationId",
			new String[] {Long.class.getName()},
			new String[] {"jtbApplicationId"}, false);

		AccoGenDeclarationUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		AccoGenDeclarationUtil.setPersistence(null);

		entityCache.removeCache(AccoGenDeclarationImpl.class.getName());
	}

	@Override
	@Reference(
		target = JTB_APPLICATION_FORMPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = JTB_APPLICATION_FORMPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = JTB_APPLICATION_FORMPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_ACCOGENDECLARATION =
		"SELECT accoGenDeclaration FROM AccoGenDeclaration accoGenDeclaration";

	private static final String _SQL_SELECT_ACCOGENDECLARATION_WHERE =
		"SELECT accoGenDeclaration FROM AccoGenDeclaration accoGenDeclaration WHERE ";

	private static final String _SQL_COUNT_ACCOGENDECLARATION =
		"SELECT COUNT(accoGenDeclaration) FROM AccoGenDeclaration accoGenDeclaration";

	private static final String _SQL_COUNT_ACCOGENDECLARATION_WHERE =
		"SELECT COUNT(accoGenDeclaration) FROM AccoGenDeclaration accoGenDeclaration WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "accoGenDeclaration.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No AccoGenDeclaration exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No AccoGenDeclaration exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		AccoGenDeclarationPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}