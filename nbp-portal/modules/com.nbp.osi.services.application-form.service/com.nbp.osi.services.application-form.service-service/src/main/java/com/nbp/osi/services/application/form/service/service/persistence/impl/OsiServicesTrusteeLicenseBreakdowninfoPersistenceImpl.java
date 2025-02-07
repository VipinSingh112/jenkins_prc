/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.services.application.form.service.service.persistence.impl;

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

import com.nbp.osi.services.application.form.service.exception.NoSuchOsiServicesTrusteeLicenseBreakdowninfoException;
import com.nbp.osi.services.application.form.service.model.OsiServicesTrusteeLicenseBreakdowninfo;
import com.nbp.osi.services.application.form.service.model.OsiServicesTrusteeLicenseBreakdowninfoTable;
import com.nbp.osi.services.application.form.service.model.impl.OsiServicesTrusteeLicenseBreakdowninfoImpl;
import com.nbp.osi.services.application.form.service.model.impl.OsiServicesTrusteeLicenseBreakdowninfoModelImpl;
import com.nbp.osi.services.application.form.service.service.persistence.OsiServicesTrusteeLicenseBreakdowninfoPersistence;
import com.nbp.osi.services.application.form.service.service.persistence.OsiServicesTrusteeLicenseBreakdowninfoUtil;
import com.nbp.osi.services.application.form.service.service.persistence.impl.constants.OSI_SERVICESPersistenceConstants;

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
 * The persistence implementation for the osi services trustee license breakdowninfo service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = OsiServicesTrusteeLicenseBreakdowninfoPersistence.class)
public class OsiServicesTrusteeLicenseBreakdowninfoPersistenceImpl
	extends BasePersistenceImpl<OsiServicesTrusteeLicenseBreakdowninfo>
	implements OsiServicesTrusteeLicenseBreakdowninfoPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>OsiServicesTrusteeLicenseBreakdowninfoUtil</code> to access the osi services trustee license breakdowninfo persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		OsiServicesTrusteeLicenseBreakdowninfoImpl.class.getName();

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
	 * Returns all the osi services trustee license breakdowninfos where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching osi services trustee license breakdowninfos
	 */
	@Override
	public List<OsiServicesTrusteeLicenseBreakdowninfo> findByUuid(
		String uuid) {

		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the osi services trustee license breakdowninfos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesTrusteeLicenseBreakdowninfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of osi services trustee license breakdowninfos
	 * @param end the upper bound of the range of osi services trustee license breakdowninfos (not inclusive)
	 * @return the range of matching osi services trustee license breakdowninfos
	 */
	@Override
	public List<OsiServicesTrusteeLicenseBreakdowninfo> findByUuid(
		String uuid, int start, int end) {

		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the osi services trustee license breakdowninfos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesTrusteeLicenseBreakdowninfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of osi services trustee license breakdowninfos
	 * @param end the upper bound of the range of osi services trustee license breakdowninfos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching osi services trustee license breakdowninfos
	 */
	@Override
	public List<OsiServicesTrusteeLicenseBreakdowninfo> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<OsiServicesTrusteeLicenseBreakdowninfo>
			orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the osi services trustee license breakdowninfos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesTrusteeLicenseBreakdowninfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of osi services trustee license breakdowninfos
	 * @param end the upper bound of the range of osi services trustee license breakdowninfos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching osi services trustee license breakdowninfos
	 */
	@Override
	public List<OsiServicesTrusteeLicenseBreakdowninfo> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<OsiServicesTrusteeLicenseBreakdowninfo>
			orderByComparator,
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

		List<OsiServicesTrusteeLicenseBreakdowninfo> list = null;

		if (useFinderCache) {
			list =
				(List<OsiServicesTrusteeLicenseBreakdowninfo>)
					finderCache.getResult(finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (OsiServicesTrusteeLicenseBreakdowninfo
						osiServicesTrusteeLicenseBreakdowninfo : list) {

					if (!uuid.equals(
							osiServicesTrusteeLicenseBreakdowninfo.getUuid())) {

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

			sb.append(_SQL_SELECT_OSISERVICESTRUSTEELICENSEBREAKDOWNINFO_WHERE);

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
				sb.append(
					OsiServicesTrusteeLicenseBreakdowninfoModelImpl.
						ORDER_BY_JPQL);
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

				list =
					(List<OsiServicesTrusteeLicenseBreakdowninfo>)
						QueryUtil.list(query, getDialect(), start, end);

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
	 * Returns the first osi services trustee license breakdowninfo in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi services trustee license breakdowninfo
	 * @throws NoSuchOsiServicesTrusteeLicenseBreakdowninfoException if a matching osi services trustee license breakdowninfo could not be found
	 */
	@Override
	public OsiServicesTrusteeLicenseBreakdowninfo findByUuid_First(
			String uuid,
			OrderByComparator<OsiServicesTrusteeLicenseBreakdowninfo>
				orderByComparator)
		throws NoSuchOsiServicesTrusteeLicenseBreakdowninfoException {

		OsiServicesTrusteeLicenseBreakdowninfo
			osiServicesTrusteeLicenseBreakdowninfo = fetchByUuid_First(
				uuid, orderByComparator);

		if (osiServicesTrusteeLicenseBreakdowninfo != null) {
			return osiServicesTrusteeLicenseBreakdowninfo;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchOsiServicesTrusteeLicenseBreakdowninfoException(
			sb.toString());
	}

	/**
	 * Returns the first osi services trustee license breakdowninfo in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi services trustee license breakdowninfo, or <code>null</code> if a matching osi services trustee license breakdowninfo could not be found
	 */
	@Override
	public OsiServicesTrusteeLicenseBreakdowninfo fetchByUuid_First(
		String uuid,
		OrderByComparator<OsiServicesTrusteeLicenseBreakdowninfo>
			orderByComparator) {

		List<OsiServicesTrusteeLicenseBreakdowninfo> list = findByUuid(
			uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last osi services trustee license breakdowninfo in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi services trustee license breakdowninfo
	 * @throws NoSuchOsiServicesTrusteeLicenseBreakdowninfoException if a matching osi services trustee license breakdowninfo could not be found
	 */
	@Override
	public OsiServicesTrusteeLicenseBreakdowninfo findByUuid_Last(
			String uuid,
			OrderByComparator<OsiServicesTrusteeLicenseBreakdowninfo>
				orderByComparator)
		throws NoSuchOsiServicesTrusteeLicenseBreakdowninfoException {

		OsiServicesTrusteeLicenseBreakdowninfo
			osiServicesTrusteeLicenseBreakdowninfo = fetchByUuid_Last(
				uuid, orderByComparator);

		if (osiServicesTrusteeLicenseBreakdowninfo != null) {
			return osiServicesTrusteeLicenseBreakdowninfo;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchOsiServicesTrusteeLicenseBreakdowninfoException(
			sb.toString());
	}

	/**
	 * Returns the last osi services trustee license breakdowninfo in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi services trustee license breakdowninfo, or <code>null</code> if a matching osi services trustee license breakdowninfo could not be found
	 */
	@Override
	public OsiServicesTrusteeLicenseBreakdowninfo fetchByUuid_Last(
		String uuid,
		OrderByComparator<OsiServicesTrusteeLicenseBreakdowninfo>
			orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<OsiServicesTrusteeLicenseBreakdowninfo> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the osi services trustee license breakdowninfos before and after the current osi services trustee license breakdowninfo in the ordered set where uuid = &#63;.
	 *
	 * @param osiLicBreakId the primary key of the current osi services trustee license breakdowninfo
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next osi services trustee license breakdowninfo
	 * @throws NoSuchOsiServicesTrusteeLicenseBreakdowninfoException if a osi services trustee license breakdowninfo with the primary key could not be found
	 */
	@Override
	public OsiServicesTrusteeLicenseBreakdowninfo[] findByUuid_PrevAndNext(
			long osiLicBreakId, String uuid,
			OrderByComparator<OsiServicesTrusteeLicenseBreakdowninfo>
				orderByComparator)
		throws NoSuchOsiServicesTrusteeLicenseBreakdowninfoException {

		uuid = Objects.toString(uuid, "");

		OsiServicesTrusteeLicenseBreakdowninfo
			osiServicesTrusteeLicenseBreakdowninfo = findByPrimaryKey(
				osiLicBreakId);

		Session session = null;

		try {
			session = openSession();

			OsiServicesTrusteeLicenseBreakdowninfo[] array =
				new OsiServicesTrusteeLicenseBreakdowninfoImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, osiServicesTrusteeLicenseBreakdowninfo, uuid,
				orderByComparator, true);

			array[1] = osiServicesTrusteeLicenseBreakdowninfo;

			array[2] = getByUuid_PrevAndNext(
				session, osiServicesTrusteeLicenseBreakdowninfo, uuid,
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

	protected OsiServicesTrusteeLicenseBreakdowninfo getByUuid_PrevAndNext(
		Session session,
		OsiServicesTrusteeLicenseBreakdowninfo
			osiServicesTrusteeLicenseBreakdowninfo,
		String uuid,
		OrderByComparator<OsiServicesTrusteeLicenseBreakdowninfo>
			orderByComparator,
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

		sb.append(_SQL_SELECT_OSISERVICESTRUSTEELICENSEBREAKDOWNINFO_WHERE);

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
			sb.append(
				OsiServicesTrusteeLicenseBreakdowninfoModelImpl.ORDER_BY_JPQL);
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
						osiServicesTrusteeLicenseBreakdowninfo)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<OsiServicesTrusteeLicenseBreakdowninfo> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the osi services trustee license breakdowninfos where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (OsiServicesTrusteeLicenseBreakdowninfo
				osiServicesTrusteeLicenseBreakdowninfo :
					findByUuid(
						uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(osiServicesTrusteeLicenseBreakdowninfo);
		}
	}

	/**
	 * Returns the number of osi services trustee license breakdowninfos where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching osi services trustee license breakdowninfos
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_OSISERVICESTRUSTEELICENSEBREAKDOWNINFO_WHERE);

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
		"osiServicesTrusteeLicenseBreakdowninfo.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(osiServicesTrusteeLicenseBreakdowninfo.uuid IS NULL OR osiServicesTrusteeLicenseBreakdowninfo.uuid = '')";

	private FinderPath _finderPathFetchByUUID_G;
	private FinderPath _finderPathCountByUUID_G;

	/**
	 * Returns the osi services trustee license breakdowninfo where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchOsiServicesTrusteeLicenseBreakdowninfoException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching osi services trustee license breakdowninfo
	 * @throws NoSuchOsiServicesTrusteeLicenseBreakdowninfoException if a matching osi services trustee license breakdowninfo could not be found
	 */
	@Override
	public OsiServicesTrusteeLicenseBreakdowninfo findByUUID_G(
			String uuid, long groupId)
		throws NoSuchOsiServicesTrusteeLicenseBreakdowninfoException {

		OsiServicesTrusteeLicenseBreakdowninfo
			osiServicesTrusteeLicenseBreakdowninfo = fetchByUUID_G(
				uuid, groupId);

		if (osiServicesTrusteeLicenseBreakdowninfo == null) {
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

			throw new NoSuchOsiServicesTrusteeLicenseBreakdowninfoException(
				sb.toString());
		}

		return osiServicesTrusteeLicenseBreakdowninfo;
	}

	/**
	 * Returns the osi services trustee license breakdowninfo where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching osi services trustee license breakdowninfo, or <code>null</code> if a matching osi services trustee license breakdowninfo could not be found
	 */
	@Override
	public OsiServicesTrusteeLicenseBreakdowninfo fetchByUUID_G(
		String uuid, long groupId) {

		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the osi services trustee license breakdowninfo where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching osi services trustee license breakdowninfo, or <code>null</code> if a matching osi services trustee license breakdowninfo could not be found
	 */
	@Override
	public OsiServicesTrusteeLicenseBreakdowninfo fetchByUUID_G(
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

		if (result instanceof OsiServicesTrusteeLicenseBreakdowninfo) {
			OsiServicesTrusteeLicenseBreakdowninfo
				osiServicesTrusteeLicenseBreakdowninfo =
					(OsiServicesTrusteeLicenseBreakdowninfo)result;

			if (!Objects.equals(
					uuid, osiServicesTrusteeLicenseBreakdowninfo.getUuid()) ||
				(groupId !=
					osiServicesTrusteeLicenseBreakdowninfo.getGroupId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_OSISERVICESTRUSTEELICENSEBREAKDOWNINFO_WHERE);

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

				List<OsiServicesTrusteeLicenseBreakdowninfo> list =
					query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByUUID_G, finderArgs, list);
					}
				}
				else {
					OsiServicesTrusteeLicenseBreakdowninfo
						osiServicesTrusteeLicenseBreakdowninfo = list.get(0);

					result = osiServicesTrusteeLicenseBreakdowninfo;

					cacheResult(osiServicesTrusteeLicenseBreakdowninfo);
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
			return (OsiServicesTrusteeLicenseBreakdowninfo)result;
		}
	}

	/**
	 * Removes the osi services trustee license breakdowninfo where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the osi services trustee license breakdowninfo that was removed
	 */
	@Override
	public OsiServicesTrusteeLicenseBreakdowninfo removeByUUID_G(
			String uuid, long groupId)
		throws NoSuchOsiServicesTrusteeLicenseBreakdowninfoException {

		OsiServicesTrusteeLicenseBreakdowninfo
			osiServicesTrusteeLicenseBreakdowninfo = findByUUID_G(
				uuid, groupId);

		return remove(osiServicesTrusteeLicenseBreakdowninfo);
	}

	/**
	 * Returns the number of osi services trustee license breakdowninfos where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching osi services trustee license breakdowninfos
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUUID_G;

		Object[] finderArgs = new Object[] {uuid, groupId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_OSISERVICESTRUSTEELICENSEBREAKDOWNINFO_WHERE);

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
		"osiServicesTrusteeLicenseBreakdowninfo.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_G_UUID_3 =
		"(osiServicesTrusteeLicenseBreakdowninfo.uuid IS NULL OR osiServicesTrusteeLicenseBreakdowninfo.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 =
		"osiServicesTrusteeLicenseBreakdowninfo.groupId = ?";

	private FinderPath _finderPathWithPaginationFindByUuid_C;
	private FinderPath _finderPathWithoutPaginationFindByUuid_C;
	private FinderPath _finderPathCountByUuid_C;

	/**
	 * Returns all the osi services trustee license breakdowninfos where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching osi services trustee license breakdowninfos
	 */
	@Override
	public List<OsiServicesTrusteeLicenseBreakdowninfo> findByUuid_C(
		String uuid, long companyId) {

		return findByUuid_C(
			uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the osi services trustee license breakdowninfos where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesTrusteeLicenseBreakdowninfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of osi services trustee license breakdowninfos
	 * @param end the upper bound of the range of osi services trustee license breakdowninfos (not inclusive)
	 * @return the range of matching osi services trustee license breakdowninfos
	 */
	@Override
	public List<OsiServicesTrusteeLicenseBreakdowninfo> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return findByUuid_C(uuid, companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the osi services trustee license breakdowninfos where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesTrusteeLicenseBreakdowninfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of osi services trustee license breakdowninfos
	 * @param end the upper bound of the range of osi services trustee license breakdowninfos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching osi services trustee license breakdowninfos
	 */
	@Override
	public List<OsiServicesTrusteeLicenseBreakdowninfo> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<OsiServicesTrusteeLicenseBreakdowninfo>
			orderByComparator) {

		return findByUuid_C(
			uuid, companyId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the osi services trustee license breakdowninfos where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesTrusteeLicenseBreakdowninfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of osi services trustee license breakdowninfos
	 * @param end the upper bound of the range of osi services trustee license breakdowninfos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching osi services trustee license breakdowninfos
	 */
	@Override
	public List<OsiServicesTrusteeLicenseBreakdowninfo> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<OsiServicesTrusteeLicenseBreakdowninfo>
			orderByComparator,
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

		List<OsiServicesTrusteeLicenseBreakdowninfo> list = null;

		if (useFinderCache) {
			list =
				(List<OsiServicesTrusteeLicenseBreakdowninfo>)
					finderCache.getResult(finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (OsiServicesTrusteeLicenseBreakdowninfo
						osiServicesTrusteeLicenseBreakdowninfo : list) {

					if (!uuid.equals(
							osiServicesTrusteeLicenseBreakdowninfo.getUuid()) ||
						(companyId !=
							osiServicesTrusteeLicenseBreakdowninfo.
								getCompanyId())) {

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

			sb.append(_SQL_SELECT_OSISERVICESTRUSTEELICENSEBREAKDOWNINFO_WHERE);

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
				sb.append(
					OsiServicesTrusteeLicenseBreakdowninfoModelImpl.
						ORDER_BY_JPQL);
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

				list =
					(List<OsiServicesTrusteeLicenseBreakdowninfo>)
						QueryUtil.list(query, getDialect(), start, end);

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
	 * Returns the first osi services trustee license breakdowninfo in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi services trustee license breakdowninfo
	 * @throws NoSuchOsiServicesTrusteeLicenseBreakdowninfoException if a matching osi services trustee license breakdowninfo could not be found
	 */
	@Override
	public OsiServicesTrusteeLicenseBreakdowninfo findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<OsiServicesTrusteeLicenseBreakdowninfo>
				orderByComparator)
		throws NoSuchOsiServicesTrusteeLicenseBreakdowninfoException {

		OsiServicesTrusteeLicenseBreakdowninfo
			osiServicesTrusteeLicenseBreakdowninfo = fetchByUuid_C_First(
				uuid, companyId, orderByComparator);

		if (osiServicesTrusteeLicenseBreakdowninfo != null) {
			return osiServicesTrusteeLicenseBreakdowninfo;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchOsiServicesTrusteeLicenseBreakdowninfoException(
			sb.toString());
	}

	/**
	 * Returns the first osi services trustee license breakdowninfo in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi services trustee license breakdowninfo, or <code>null</code> if a matching osi services trustee license breakdowninfo could not be found
	 */
	@Override
	public OsiServicesTrusteeLicenseBreakdowninfo fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<OsiServicesTrusteeLicenseBreakdowninfo>
			orderByComparator) {

		List<OsiServicesTrusteeLicenseBreakdowninfo> list = findByUuid_C(
			uuid, companyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last osi services trustee license breakdowninfo in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi services trustee license breakdowninfo
	 * @throws NoSuchOsiServicesTrusteeLicenseBreakdowninfoException if a matching osi services trustee license breakdowninfo could not be found
	 */
	@Override
	public OsiServicesTrusteeLicenseBreakdowninfo findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<OsiServicesTrusteeLicenseBreakdowninfo>
				orderByComparator)
		throws NoSuchOsiServicesTrusteeLicenseBreakdowninfoException {

		OsiServicesTrusteeLicenseBreakdowninfo
			osiServicesTrusteeLicenseBreakdowninfo = fetchByUuid_C_Last(
				uuid, companyId, orderByComparator);

		if (osiServicesTrusteeLicenseBreakdowninfo != null) {
			return osiServicesTrusteeLicenseBreakdowninfo;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchOsiServicesTrusteeLicenseBreakdowninfoException(
			sb.toString());
	}

	/**
	 * Returns the last osi services trustee license breakdowninfo in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi services trustee license breakdowninfo, or <code>null</code> if a matching osi services trustee license breakdowninfo could not be found
	 */
	@Override
	public OsiServicesTrusteeLicenseBreakdowninfo fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<OsiServicesTrusteeLicenseBreakdowninfo>
			orderByComparator) {

		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<OsiServicesTrusteeLicenseBreakdowninfo> list = findByUuid_C(
			uuid, companyId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the osi services trustee license breakdowninfos before and after the current osi services trustee license breakdowninfo in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param osiLicBreakId the primary key of the current osi services trustee license breakdowninfo
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next osi services trustee license breakdowninfo
	 * @throws NoSuchOsiServicesTrusteeLicenseBreakdowninfoException if a osi services trustee license breakdowninfo with the primary key could not be found
	 */
	@Override
	public OsiServicesTrusteeLicenseBreakdowninfo[] findByUuid_C_PrevAndNext(
			long osiLicBreakId, String uuid, long companyId,
			OrderByComparator<OsiServicesTrusteeLicenseBreakdowninfo>
				orderByComparator)
		throws NoSuchOsiServicesTrusteeLicenseBreakdowninfoException {

		uuid = Objects.toString(uuid, "");

		OsiServicesTrusteeLicenseBreakdowninfo
			osiServicesTrusteeLicenseBreakdowninfo = findByPrimaryKey(
				osiLicBreakId);

		Session session = null;

		try {
			session = openSession();

			OsiServicesTrusteeLicenseBreakdowninfo[] array =
				new OsiServicesTrusteeLicenseBreakdowninfoImpl[3];

			array[0] = getByUuid_C_PrevAndNext(
				session, osiServicesTrusteeLicenseBreakdowninfo, uuid,
				companyId, orderByComparator, true);

			array[1] = osiServicesTrusteeLicenseBreakdowninfo;

			array[2] = getByUuid_C_PrevAndNext(
				session, osiServicesTrusteeLicenseBreakdowninfo, uuid,
				companyId, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected OsiServicesTrusteeLicenseBreakdowninfo getByUuid_C_PrevAndNext(
		Session session,
		OsiServicesTrusteeLicenseBreakdowninfo
			osiServicesTrusteeLicenseBreakdowninfo,
		String uuid, long companyId,
		OrderByComparator<OsiServicesTrusteeLicenseBreakdowninfo>
			orderByComparator,
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

		sb.append(_SQL_SELECT_OSISERVICESTRUSTEELICENSEBREAKDOWNINFO_WHERE);

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
			sb.append(
				OsiServicesTrusteeLicenseBreakdowninfoModelImpl.ORDER_BY_JPQL);
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
						osiServicesTrusteeLicenseBreakdowninfo)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<OsiServicesTrusteeLicenseBreakdowninfo> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the osi services trustee license breakdowninfos where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (OsiServicesTrusteeLicenseBreakdowninfo
				osiServicesTrusteeLicenseBreakdowninfo :
					findByUuid_C(
						uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
						null)) {

			remove(osiServicesTrusteeLicenseBreakdowninfo);
		}
	}

	/**
	 * Returns the number of osi services trustee license breakdowninfos where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching osi services trustee license breakdowninfos
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid_C;

		Object[] finderArgs = new Object[] {uuid, companyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_OSISERVICESTRUSTEELICENSEBREAKDOWNINFO_WHERE);

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
		"osiServicesTrusteeLicenseBreakdowninfo.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_C_UUID_3 =
		"(osiServicesTrusteeLicenseBreakdowninfo.uuid IS NULL OR osiServicesTrusteeLicenseBreakdowninfo.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 =
		"osiServicesTrusteeLicenseBreakdowninfo.companyId = ?";

	private FinderPath _finderPathFetchBygetOsiServicesById;
	private FinderPath _finderPathCountBygetOsiServicesById;

	/**
	 * Returns the osi services trustee license breakdowninfo where osiServicesApplicationId = &#63; or throws a <code>NoSuchOsiServicesTrusteeLicenseBreakdowninfoException</code> if it could not be found.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @return the matching osi services trustee license breakdowninfo
	 * @throws NoSuchOsiServicesTrusteeLicenseBreakdowninfoException if a matching osi services trustee license breakdowninfo could not be found
	 */
	@Override
	public OsiServicesTrusteeLicenseBreakdowninfo findBygetOsiServicesById(
			long osiServicesApplicationId)
		throws NoSuchOsiServicesTrusteeLicenseBreakdowninfoException {

		OsiServicesTrusteeLicenseBreakdowninfo
			osiServicesTrusteeLicenseBreakdowninfo = fetchBygetOsiServicesById(
				osiServicesApplicationId);

		if (osiServicesTrusteeLicenseBreakdowninfo == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("osiServicesApplicationId=");
			sb.append(osiServicesApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchOsiServicesTrusteeLicenseBreakdowninfoException(
				sb.toString());
		}

		return osiServicesTrusteeLicenseBreakdowninfo;
	}

	/**
	 * Returns the osi services trustee license breakdowninfo where osiServicesApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @return the matching osi services trustee license breakdowninfo, or <code>null</code> if a matching osi services trustee license breakdowninfo could not be found
	 */
	@Override
	public OsiServicesTrusteeLicenseBreakdowninfo fetchBygetOsiServicesById(
		long osiServicesApplicationId) {

		return fetchBygetOsiServicesById(osiServicesApplicationId, true);
	}

	/**
	 * Returns the osi services trustee license breakdowninfo where osiServicesApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching osi services trustee license breakdowninfo, or <code>null</code> if a matching osi services trustee license breakdowninfo could not be found
	 */
	@Override
	public OsiServicesTrusteeLicenseBreakdowninfo fetchBygetOsiServicesById(
		long osiServicesApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {osiServicesApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetOsiServicesById, finderArgs, this);
		}

		if (result instanceof OsiServicesTrusteeLicenseBreakdowninfo) {
			OsiServicesTrusteeLicenseBreakdowninfo
				osiServicesTrusteeLicenseBreakdowninfo =
					(OsiServicesTrusteeLicenseBreakdowninfo)result;

			if (osiServicesApplicationId !=
					osiServicesTrusteeLicenseBreakdowninfo.
						getOsiServicesApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_OSISERVICESTRUSTEELICENSEBREAKDOWNINFO_WHERE);

			sb.append(
				_FINDER_COLUMN_GETOSISERVICESBYID_OSISERVICESAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(osiServicesApplicationId);

				List<OsiServicesTrusteeLicenseBreakdowninfo> list =
					query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetOsiServicesById, finderArgs,
							list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {
									osiServicesApplicationId
								};
							}

							_log.warn(
								"OsiServicesTrusteeLicenseBreakdowninfoPersistenceImpl.fetchBygetOsiServicesById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					OsiServicesTrusteeLicenseBreakdowninfo
						osiServicesTrusteeLicenseBreakdowninfo = list.get(0);

					result = osiServicesTrusteeLicenseBreakdowninfo;

					cacheResult(osiServicesTrusteeLicenseBreakdowninfo);
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
			return (OsiServicesTrusteeLicenseBreakdowninfo)result;
		}
	}

	/**
	 * Removes the osi services trustee license breakdowninfo where osiServicesApplicationId = &#63; from the database.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @return the osi services trustee license breakdowninfo that was removed
	 */
	@Override
	public OsiServicesTrusteeLicenseBreakdowninfo removeBygetOsiServicesById(
			long osiServicesApplicationId)
		throws NoSuchOsiServicesTrusteeLicenseBreakdowninfoException {

		OsiServicesTrusteeLicenseBreakdowninfo
			osiServicesTrusteeLicenseBreakdowninfo = findBygetOsiServicesById(
				osiServicesApplicationId);

		return remove(osiServicesTrusteeLicenseBreakdowninfo);
	}

	/**
	 * Returns the number of osi services trustee license breakdowninfos where osiServicesApplicationId = &#63;.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @return the number of matching osi services trustee license breakdowninfos
	 */
	@Override
	public int countBygetOsiServicesById(long osiServicesApplicationId) {
		FinderPath finderPath = _finderPathCountBygetOsiServicesById;

		Object[] finderArgs = new Object[] {osiServicesApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_OSISERVICESTRUSTEELICENSEBREAKDOWNINFO_WHERE);

			sb.append(
				_FINDER_COLUMN_GETOSISERVICESBYID_OSISERVICESAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(osiServicesApplicationId);

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
		_FINDER_COLUMN_GETOSISERVICESBYID_OSISERVICESAPPLICATIONID_2 =
			"osiServicesTrusteeLicenseBreakdowninfo.osiServicesApplicationId = ?";

	public OsiServicesTrusteeLicenseBreakdowninfoPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");

		setDBColumnNames(dbColumnNames);

		setModelClass(OsiServicesTrusteeLicenseBreakdowninfo.class);

		setModelImplClass(OsiServicesTrusteeLicenseBreakdowninfoImpl.class);
		setModelPKClass(long.class);

		setTable(OsiServicesTrusteeLicenseBreakdowninfoTable.INSTANCE);
	}

	/**
	 * Caches the osi services trustee license breakdowninfo in the entity cache if it is enabled.
	 *
	 * @param osiServicesTrusteeLicenseBreakdowninfo the osi services trustee license breakdowninfo
	 */
	@Override
	public void cacheResult(
		OsiServicesTrusteeLicenseBreakdowninfo
			osiServicesTrusteeLicenseBreakdowninfo) {

		entityCache.putResult(
			OsiServicesTrusteeLicenseBreakdowninfoImpl.class,
			osiServicesTrusteeLicenseBreakdowninfo.getPrimaryKey(),
			osiServicesTrusteeLicenseBreakdowninfo);

		finderCache.putResult(
			_finderPathFetchByUUID_G,
			new Object[] {
				osiServicesTrusteeLicenseBreakdowninfo.getUuid(),
				osiServicesTrusteeLicenseBreakdowninfo.getGroupId()
			},
			osiServicesTrusteeLicenseBreakdowninfo);

		finderCache.putResult(
			_finderPathFetchBygetOsiServicesById,
			new Object[] {
				osiServicesTrusteeLicenseBreakdowninfo.
					getOsiServicesApplicationId()
			},
			osiServicesTrusteeLicenseBreakdowninfo);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the osi services trustee license breakdowninfos in the entity cache if it is enabled.
	 *
	 * @param osiServicesTrusteeLicenseBreakdowninfos the osi services trustee license breakdowninfos
	 */
	@Override
	public void cacheResult(
		List<OsiServicesTrusteeLicenseBreakdowninfo>
			osiServicesTrusteeLicenseBreakdowninfos) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (osiServicesTrusteeLicenseBreakdowninfos.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (OsiServicesTrusteeLicenseBreakdowninfo
				osiServicesTrusteeLicenseBreakdowninfo :
					osiServicesTrusteeLicenseBreakdowninfos) {

			if (entityCache.getResult(
					OsiServicesTrusteeLicenseBreakdowninfoImpl.class,
					osiServicesTrusteeLicenseBreakdowninfo.getPrimaryKey()) ==
						null) {

				cacheResult(osiServicesTrusteeLicenseBreakdowninfo);
			}
		}
	}

	/**
	 * Clears the cache for all osi services trustee license breakdowninfos.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(
			OsiServicesTrusteeLicenseBreakdowninfoImpl.class);

		finderCache.clearCache(
			OsiServicesTrusteeLicenseBreakdowninfoImpl.class);
	}

	/**
	 * Clears the cache for the osi services trustee license breakdowninfo.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		OsiServicesTrusteeLicenseBreakdowninfo
			osiServicesTrusteeLicenseBreakdowninfo) {

		entityCache.removeResult(
			OsiServicesTrusteeLicenseBreakdowninfoImpl.class,
			osiServicesTrusteeLicenseBreakdowninfo);
	}

	@Override
	public void clearCache(
		List<OsiServicesTrusteeLicenseBreakdowninfo>
			osiServicesTrusteeLicenseBreakdowninfos) {

		for (OsiServicesTrusteeLicenseBreakdowninfo
				osiServicesTrusteeLicenseBreakdowninfo :
					osiServicesTrusteeLicenseBreakdowninfos) {

			entityCache.removeResult(
				OsiServicesTrusteeLicenseBreakdowninfoImpl.class,
				osiServicesTrusteeLicenseBreakdowninfo);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(
			OsiServicesTrusteeLicenseBreakdowninfoImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				OsiServicesTrusteeLicenseBreakdowninfoImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		OsiServicesTrusteeLicenseBreakdowninfoModelImpl
			osiServicesTrusteeLicenseBreakdowninfoModelImpl) {

		Object[] args = new Object[] {
			osiServicesTrusteeLicenseBreakdowninfoModelImpl.getUuid(),
			osiServicesTrusteeLicenseBreakdowninfoModelImpl.getGroupId()
		};

		finderCache.putResult(_finderPathCountByUUID_G, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchByUUID_G, args,
			osiServicesTrusteeLicenseBreakdowninfoModelImpl);

		args = new Object[] {
			osiServicesTrusteeLicenseBreakdowninfoModelImpl.
				getOsiServicesApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetOsiServicesById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetOsiServicesById, args,
			osiServicesTrusteeLicenseBreakdowninfoModelImpl);
	}

	/**
	 * Creates a new osi services trustee license breakdowninfo with the primary key. Does not add the osi services trustee license breakdowninfo to the database.
	 *
	 * @param osiLicBreakId the primary key for the new osi services trustee license breakdowninfo
	 * @return the new osi services trustee license breakdowninfo
	 */
	@Override
	public OsiServicesTrusteeLicenseBreakdowninfo create(long osiLicBreakId) {
		OsiServicesTrusteeLicenseBreakdowninfo
			osiServicesTrusteeLicenseBreakdowninfo =
				new OsiServicesTrusteeLicenseBreakdowninfoImpl();

		osiServicesTrusteeLicenseBreakdowninfo.setNew(true);
		osiServicesTrusteeLicenseBreakdowninfo.setPrimaryKey(osiLicBreakId);

		String uuid = PortalUUIDUtil.generate();

		osiServicesTrusteeLicenseBreakdowninfo.setUuid(uuid);

		osiServicesTrusteeLicenseBreakdowninfo.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return osiServicesTrusteeLicenseBreakdowninfo;
	}

	/**
	 * Removes the osi services trustee license breakdowninfo with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param osiLicBreakId the primary key of the osi services trustee license breakdowninfo
	 * @return the osi services trustee license breakdowninfo that was removed
	 * @throws NoSuchOsiServicesTrusteeLicenseBreakdowninfoException if a osi services trustee license breakdowninfo with the primary key could not be found
	 */
	@Override
	public OsiServicesTrusteeLicenseBreakdowninfo remove(long osiLicBreakId)
		throws NoSuchOsiServicesTrusteeLicenseBreakdowninfoException {

		return remove((Serializable)osiLicBreakId);
	}

	/**
	 * Removes the osi services trustee license breakdowninfo with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the osi services trustee license breakdowninfo
	 * @return the osi services trustee license breakdowninfo that was removed
	 * @throws NoSuchOsiServicesTrusteeLicenseBreakdowninfoException if a osi services trustee license breakdowninfo with the primary key could not be found
	 */
	@Override
	public OsiServicesTrusteeLicenseBreakdowninfo remove(
			Serializable primaryKey)
		throws NoSuchOsiServicesTrusteeLicenseBreakdowninfoException {

		Session session = null;

		try {
			session = openSession();

			OsiServicesTrusteeLicenseBreakdowninfo
				osiServicesTrusteeLicenseBreakdowninfo =
					(OsiServicesTrusteeLicenseBreakdowninfo)session.get(
						OsiServicesTrusteeLicenseBreakdowninfoImpl.class,
						primaryKey);

			if (osiServicesTrusteeLicenseBreakdowninfo == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchOsiServicesTrusteeLicenseBreakdowninfoException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(osiServicesTrusteeLicenseBreakdowninfo);
		}
		catch (NoSuchOsiServicesTrusteeLicenseBreakdowninfoException
					noSuchEntityException) {

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
	protected OsiServicesTrusteeLicenseBreakdowninfo removeImpl(
		OsiServicesTrusteeLicenseBreakdowninfo
			osiServicesTrusteeLicenseBreakdowninfo) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(osiServicesTrusteeLicenseBreakdowninfo)) {
				osiServicesTrusteeLicenseBreakdowninfo =
					(OsiServicesTrusteeLicenseBreakdowninfo)session.get(
						OsiServicesTrusteeLicenseBreakdowninfoImpl.class,
						osiServicesTrusteeLicenseBreakdowninfo.
							getPrimaryKeyObj());
			}

			if (osiServicesTrusteeLicenseBreakdowninfo != null) {
				session.delete(osiServicesTrusteeLicenseBreakdowninfo);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (osiServicesTrusteeLicenseBreakdowninfo != null) {
			clearCache(osiServicesTrusteeLicenseBreakdowninfo);
		}

		return osiServicesTrusteeLicenseBreakdowninfo;
	}

	@Override
	public OsiServicesTrusteeLicenseBreakdowninfo updateImpl(
		OsiServicesTrusteeLicenseBreakdowninfo
			osiServicesTrusteeLicenseBreakdowninfo) {

		boolean isNew = osiServicesTrusteeLicenseBreakdowninfo.isNew();

		if (!(osiServicesTrusteeLicenseBreakdowninfo instanceof
				OsiServicesTrusteeLicenseBreakdowninfoModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(
					osiServicesTrusteeLicenseBreakdowninfo.getClass())) {

				invocationHandler = ProxyUtil.getInvocationHandler(
					osiServicesTrusteeLicenseBreakdowninfo);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in osiServicesTrusteeLicenseBreakdowninfo proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom OsiServicesTrusteeLicenseBreakdowninfo implementation " +
					osiServicesTrusteeLicenseBreakdowninfo.getClass());
		}

		OsiServicesTrusteeLicenseBreakdowninfoModelImpl
			osiServicesTrusteeLicenseBreakdowninfoModelImpl =
				(OsiServicesTrusteeLicenseBreakdowninfoModelImpl)
					osiServicesTrusteeLicenseBreakdowninfo;

		if (Validator.isNull(
				osiServicesTrusteeLicenseBreakdowninfo.getUuid())) {

			String uuid = PortalUUIDUtil.generate();

			osiServicesTrusteeLicenseBreakdowninfo.setUuid(uuid);
		}

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew &&
			(osiServicesTrusteeLicenseBreakdowninfo.getCreateDate() == null)) {

			if (serviceContext == null) {
				osiServicesTrusteeLicenseBreakdowninfo.setCreateDate(date);
			}
			else {
				osiServicesTrusteeLicenseBreakdowninfo.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!osiServicesTrusteeLicenseBreakdowninfoModelImpl.
				hasSetModifiedDate()) {

			if (serviceContext == null) {
				osiServicesTrusteeLicenseBreakdowninfo.setModifiedDate(date);
			}
			else {
				osiServicesTrusteeLicenseBreakdowninfo.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(osiServicesTrusteeLicenseBreakdowninfo);
			}
			else {
				osiServicesTrusteeLicenseBreakdowninfo =
					(OsiServicesTrusteeLicenseBreakdowninfo)session.merge(
						osiServicesTrusteeLicenseBreakdowninfo);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			OsiServicesTrusteeLicenseBreakdowninfoImpl.class,
			osiServicesTrusteeLicenseBreakdowninfoModelImpl, false, true);

		cacheUniqueFindersCache(
			osiServicesTrusteeLicenseBreakdowninfoModelImpl);

		if (isNew) {
			osiServicesTrusteeLicenseBreakdowninfo.setNew(false);
		}

		osiServicesTrusteeLicenseBreakdowninfo.resetOriginalValues();

		return osiServicesTrusteeLicenseBreakdowninfo;
	}

	/**
	 * Returns the osi services trustee license breakdowninfo with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the osi services trustee license breakdowninfo
	 * @return the osi services trustee license breakdowninfo
	 * @throws NoSuchOsiServicesTrusteeLicenseBreakdowninfoException if a osi services trustee license breakdowninfo with the primary key could not be found
	 */
	@Override
	public OsiServicesTrusteeLicenseBreakdowninfo findByPrimaryKey(
			Serializable primaryKey)
		throws NoSuchOsiServicesTrusteeLicenseBreakdowninfoException {

		OsiServicesTrusteeLicenseBreakdowninfo
			osiServicesTrusteeLicenseBreakdowninfo = fetchByPrimaryKey(
				primaryKey);

		if (osiServicesTrusteeLicenseBreakdowninfo == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchOsiServicesTrusteeLicenseBreakdowninfoException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return osiServicesTrusteeLicenseBreakdowninfo;
	}

	/**
	 * Returns the osi services trustee license breakdowninfo with the primary key or throws a <code>NoSuchOsiServicesTrusteeLicenseBreakdowninfoException</code> if it could not be found.
	 *
	 * @param osiLicBreakId the primary key of the osi services trustee license breakdowninfo
	 * @return the osi services trustee license breakdowninfo
	 * @throws NoSuchOsiServicesTrusteeLicenseBreakdowninfoException if a osi services trustee license breakdowninfo with the primary key could not be found
	 */
	@Override
	public OsiServicesTrusteeLicenseBreakdowninfo findByPrimaryKey(
			long osiLicBreakId)
		throws NoSuchOsiServicesTrusteeLicenseBreakdowninfoException {

		return findByPrimaryKey((Serializable)osiLicBreakId);
	}

	/**
	 * Returns the osi services trustee license breakdowninfo with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param osiLicBreakId the primary key of the osi services trustee license breakdowninfo
	 * @return the osi services trustee license breakdowninfo, or <code>null</code> if a osi services trustee license breakdowninfo with the primary key could not be found
	 */
	@Override
	public OsiServicesTrusteeLicenseBreakdowninfo fetchByPrimaryKey(
		long osiLicBreakId) {

		return fetchByPrimaryKey((Serializable)osiLicBreakId);
	}

	/**
	 * Returns all the osi services trustee license breakdowninfos.
	 *
	 * @return the osi services trustee license breakdowninfos
	 */
	@Override
	public List<OsiServicesTrusteeLicenseBreakdowninfo> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the osi services trustee license breakdowninfos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesTrusteeLicenseBreakdowninfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi services trustee license breakdowninfos
	 * @param end the upper bound of the range of osi services trustee license breakdowninfos (not inclusive)
	 * @return the range of osi services trustee license breakdowninfos
	 */
	@Override
	public List<OsiServicesTrusteeLicenseBreakdowninfo> findAll(
		int start, int end) {

		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the osi services trustee license breakdowninfos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesTrusteeLicenseBreakdowninfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi services trustee license breakdowninfos
	 * @param end the upper bound of the range of osi services trustee license breakdowninfos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of osi services trustee license breakdowninfos
	 */
	@Override
	public List<OsiServicesTrusteeLicenseBreakdowninfo> findAll(
		int start, int end,
		OrderByComparator<OsiServicesTrusteeLicenseBreakdowninfo>
			orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the osi services trustee license breakdowninfos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesTrusteeLicenseBreakdowninfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi services trustee license breakdowninfos
	 * @param end the upper bound of the range of osi services trustee license breakdowninfos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of osi services trustee license breakdowninfos
	 */
	@Override
	public List<OsiServicesTrusteeLicenseBreakdowninfo> findAll(
		int start, int end,
		OrderByComparator<OsiServicesTrusteeLicenseBreakdowninfo>
			orderByComparator,
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

		List<OsiServicesTrusteeLicenseBreakdowninfo> list = null;

		if (useFinderCache) {
			list =
				(List<OsiServicesTrusteeLicenseBreakdowninfo>)
					finderCache.getResult(finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_OSISERVICESTRUSTEELICENSEBREAKDOWNINFO);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_OSISERVICESTRUSTEELICENSEBREAKDOWNINFO;

				sql = sql.concat(
					OsiServicesTrusteeLicenseBreakdowninfoModelImpl.
						ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list =
					(List<OsiServicesTrusteeLicenseBreakdowninfo>)
						QueryUtil.list(query, getDialect(), start, end);

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
	 * Removes all the osi services trustee license breakdowninfos from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (OsiServicesTrusteeLicenseBreakdowninfo
				osiServicesTrusteeLicenseBreakdowninfo : findAll()) {

			remove(osiServicesTrusteeLicenseBreakdowninfo);
		}
	}

	/**
	 * Returns the number of osi services trustee license breakdowninfos.
	 *
	 * @return the number of osi services trustee license breakdowninfos
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
					_SQL_COUNT_OSISERVICESTRUSTEELICENSEBREAKDOWNINFO);

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
		return "osiLicBreakId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_OSISERVICESTRUSTEELICENSEBREAKDOWNINFO;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return OsiServicesTrusteeLicenseBreakdowninfoModelImpl.
			TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the osi services trustee license breakdowninfo persistence.
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

		_finderPathFetchBygetOsiServicesById = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetOsiServicesById",
			new String[] {Long.class.getName()},
			new String[] {"osiServicesApplicationId"}, true);

		_finderPathCountBygetOsiServicesById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetOsiServicesById", new String[] {Long.class.getName()},
			new String[] {"osiServicesApplicationId"}, false);

		OsiServicesTrusteeLicenseBreakdowninfoUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		OsiServicesTrusteeLicenseBreakdowninfoUtil.setPersistence(null);

		entityCache.removeCache(
			OsiServicesTrusteeLicenseBreakdowninfoImpl.class.getName());
	}

	@Override
	@Reference(
		target = OSI_SERVICESPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = OSI_SERVICESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = OSI_SERVICESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String
		_SQL_SELECT_OSISERVICESTRUSTEELICENSEBREAKDOWNINFO =
			"SELECT osiServicesTrusteeLicenseBreakdowninfo FROM OsiServicesTrusteeLicenseBreakdowninfo osiServicesTrusteeLicenseBreakdowninfo";

	private static final String
		_SQL_SELECT_OSISERVICESTRUSTEELICENSEBREAKDOWNINFO_WHERE =
			"SELECT osiServicesTrusteeLicenseBreakdowninfo FROM OsiServicesTrusteeLicenseBreakdowninfo osiServicesTrusteeLicenseBreakdowninfo WHERE ";

	private static final String
		_SQL_COUNT_OSISERVICESTRUSTEELICENSEBREAKDOWNINFO =
			"SELECT COUNT(osiServicesTrusteeLicenseBreakdowninfo) FROM OsiServicesTrusteeLicenseBreakdowninfo osiServicesTrusteeLicenseBreakdowninfo";

	private static final String
		_SQL_COUNT_OSISERVICESTRUSTEELICENSEBREAKDOWNINFO_WHERE =
			"SELECT COUNT(osiServicesTrusteeLicenseBreakdowninfo) FROM OsiServicesTrusteeLicenseBreakdowninfo osiServicesTrusteeLicenseBreakdowninfo WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"osiServicesTrusteeLicenseBreakdowninfo.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No OsiServicesTrusteeLicenseBreakdowninfo exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No OsiServicesTrusteeLicenseBreakdowninfo exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		OsiServicesTrusteeLicenseBreakdowninfoPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}