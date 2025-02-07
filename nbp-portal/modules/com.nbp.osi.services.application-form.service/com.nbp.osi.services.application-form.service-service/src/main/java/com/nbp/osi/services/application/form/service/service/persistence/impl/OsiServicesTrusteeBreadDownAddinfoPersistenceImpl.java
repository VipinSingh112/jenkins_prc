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

import com.nbp.osi.services.application.form.service.exception.NoSuchOsiServicesTrusteeBreadDownAddinfoException;
import com.nbp.osi.services.application.form.service.model.OsiServicesTrusteeBreadDownAddinfo;
import com.nbp.osi.services.application.form.service.model.OsiServicesTrusteeBreadDownAddinfoTable;
import com.nbp.osi.services.application.form.service.model.impl.OsiServicesTrusteeBreadDownAddinfoImpl;
import com.nbp.osi.services.application.form.service.model.impl.OsiServicesTrusteeBreadDownAddinfoModelImpl;
import com.nbp.osi.services.application.form.service.service.persistence.OsiServicesTrusteeBreadDownAddinfoPersistence;
import com.nbp.osi.services.application.form.service.service.persistence.OsiServicesTrusteeBreadDownAddinfoUtil;
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
 * The persistence implementation for the osi services trustee bread down addinfo service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = OsiServicesTrusteeBreadDownAddinfoPersistence.class)
public class OsiServicesTrusteeBreadDownAddinfoPersistenceImpl
	extends BasePersistenceImpl<OsiServicesTrusteeBreadDownAddinfo>
	implements OsiServicesTrusteeBreadDownAddinfoPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>OsiServicesTrusteeBreadDownAddinfoUtil</code> to access the osi services trustee bread down addinfo persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		OsiServicesTrusteeBreadDownAddinfoImpl.class.getName();

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
	 * Returns all the osi services trustee bread down addinfos where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching osi services trustee bread down addinfos
	 */
	@Override
	public List<OsiServicesTrusteeBreadDownAddinfo> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the osi services trustee bread down addinfos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesTrusteeBreadDownAddinfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of osi services trustee bread down addinfos
	 * @param end the upper bound of the range of osi services trustee bread down addinfos (not inclusive)
	 * @return the range of matching osi services trustee bread down addinfos
	 */
	@Override
	public List<OsiServicesTrusteeBreadDownAddinfo> findByUuid(
		String uuid, int start, int end) {

		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the osi services trustee bread down addinfos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesTrusteeBreadDownAddinfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of osi services trustee bread down addinfos
	 * @param end the upper bound of the range of osi services trustee bread down addinfos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching osi services trustee bread down addinfos
	 */
	@Override
	public List<OsiServicesTrusteeBreadDownAddinfo> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<OsiServicesTrusteeBreadDownAddinfo>
			orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the osi services trustee bread down addinfos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesTrusteeBreadDownAddinfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of osi services trustee bread down addinfos
	 * @param end the upper bound of the range of osi services trustee bread down addinfos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching osi services trustee bread down addinfos
	 */
	@Override
	public List<OsiServicesTrusteeBreadDownAddinfo> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<OsiServicesTrusteeBreadDownAddinfo> orderByComparator,
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

		List<OsiServicesTrusteeBreadDownAddinfo> list = null;

		if (useFinderCache) {
			list =
				(List<OsiServicesTrusteeBreadDownAddinfo>)finderCache.getResult(
					finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (OsiServicesTrusteeBreadDownAddinfo
						osiServicesTrusteeBreadDownAddinfo : list) {

					if (!uuid.equals(
							osiServicesTrusteeBreadDownAddinfo.getUuid())) {

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

			sb.append(_SQL_SELECT_OSISERVICESTRUSTEEBREADDOWNADDINFO_WHERE);

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
					OsiServicesTrusteeBreadDownAddinfoModelImpl.ORDER_BY_JPQL);
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

				list = (List<OsiServicesTrusteeBreadDownAddinfo>)QueryUtil.list(
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
	 * Returns the first osi services trustee bread down addinfo in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi services trustee bread down addinfo
	 * @throws NoSuchOsiServicesTrusteeBreadDownAddinfoException if a matching osi services trustee bread down addinfo could not be found
	 */
	@Override
	public OsiServicesTrusteeBreadDownAddinfo findByUuid_First(
			String uuid,
			OrderByComparator<OsiServicesTrusteeBreadDownAddinfo>
				orderByComparator)
		throws NoSuchOsiServicesTrusteeBreadDownAddinfoException {

		OsiServicesTrusteeBreadDownAddinfo osiServicesTrusteeBreadDownAddinfo =
			fetchByUuid_First(uuid, orderByComparator);

		if (osiServicesTrusteeBreadDownAddinfo != null) {
			return osiServicesTrusteeBreadDownAddinfo;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchOsiServicesTrusteeBreadDownAddinfoException(
			sb.toString());
	}

	/**
	 * Returns the first osi services trustee bread down addinfo in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi services trustee bread down addinfo, or <code>null</code> if a matching osi services trustee bread down addinfo could not be found
	 */
	@Override
	public OsiServicesTrusteeBreadDownAddinfo fetchByUuid_First(
		String uuid,
		OrderByComparator<OsiServicesTrusteeBreadDownAddinfo>
			orderByComparator) {

		List<OsiServicesTrusteeBreadDownAddinfo> list = findByUuid(
			uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last osi services trustee bread down addinfo in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi services trustee bread down addinfo
	 * @throws NoSuchOsiServicesTrusteeBreadDownAddinfoException if a matching osi services trustee bread down addinfo could not be found
	 */
	@Override
	public OsiServicesTrusteeBreadDownAddinfo findByUuid_Last(
			String uuid,
			OrderByComparator<OsiServicesTrusteeBreadDownAddinfo>
				orderByComparator)
		throws NoSuchOsiServicesTrusteeBreadDownAddinfoException {

		OsiServicesTrusteeBreadDownAddinfo osiServicesTrusteeBreadDownAddinfo =
			fetchByUuid_Last(uuid, orderByComparator);

		if (osiServicesTrusteeBreadDownAddinfo != null) {
			return osiServicesTrusteeBreadDownAddinfo;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchOsiServicesTrusteeBreadDownAddinfoException(
			sb.toString());
	}

	/**
	 * Returns the last osi services trustee bread down addinfo in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi services trustee bread down addinfo, or <code>null</code> if a matching osi services trustee bread down addinfo could not be found
	 */
	@Override
	public OsiServicesTrusteeBreadDownAddinfo fetchByUuid_Last(
		String uuid,
		OrderByComparator<OsiServicesTrusteeBreadDownAddinfo>
			orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<OsiServicesTrusteeBreadDownAddinfo> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the osi services trustee bread down addinfos before and after the current osi services trustee bread down addinfo in the ordered set where uuid = &#63;.
	 *
	 * @param osiTrusId the primary key of the current osi services trustee bread down addinfo
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next osi services trustee bread down addinfo
	 * @throws NoSuchOsiServicesTrusteeBreadDownAddinfoException if a osi services trustee bread down addinfo with the primary key could not be found
	 */
	@Override
	public OsiServicesTrusteeBreadDownAddinfo[] findByUuid_PrevAndNext(
			long osiTrusId, String uuid,
			OrderByComparator<OsiServicesTrusteeBreadDownAddinfo>
				orderByComparator)
		throws NoSuchOsiServicesTrusteeBreadDownAddinfoException {

		uuid = Objects.toString(uuid, "");

		OsiServicesTrusteeBreadDownAddinfo osiServicesTrusteeBreadDownAddinfo =
			findByPrimaryKey(osiTrusId);

		Session session = null;

		try {
			session = openSession();

			OsiServicesTrusteeBreadDownAddinfo[] array =
				new OsiServicesTrusteeBreadDownAddinfoImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, osiServicesTrusteeBreadDownAddinfo, uuid,
				orderByComparator, true);

			array[1] = osiServicesTrusteeBreadDownAddinfo;

			array[2] = getByUuid_PrevAndNext(
				session, osiServicesTrusteeBreadDownAddinfo, uuid,
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

	protected OsiServicesTrusteeBreadDownAddinfo getByUuid_PrevAndNext(
		Session session,
		OsiServicesTrusteeBreadDownAddinfo osiServicesTrusteeBreadDownAddinfo,
		String uuid,
		OrderByComparator<OsiServicesTrusteeBreadDownAddinfo> orderByComparator,
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

		sb.append(_SQL_SELECT_OSISERVICESTRUSTEEBREADDOWNADDINFO_WHERE);

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
				OsiServicesTrusteeBreadDownAddinfoModelImpl.ORDER_BY_JPQL);
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
						osiServicesTrusteeBreadDownAddinfo)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<OsiServicesTrusteeBreadDownAddinfo> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the osi services trustee bread down addinfos where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (OsiServicesTrusteeBreadDownAddinfo
				osiServicesTrusteeBreadDownAddinfo :
					findByUuid(
						uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(osiServicesTrusteeBreadDownAddinfo);
		}
	}

	/**
	 * Returns the number of osi services trustee bread down addinfos where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching osi services trustee bread down addinfos
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_OSISERVICESTRUSTEEBREADDOWNADDINFO_WHERE);

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
		"osiServicesTrusteeBreadDownAddinfo.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(osiServicesTrusteeBreadDownAddinfo.uuid IS NULL OR osiServicesTrusteeBreadDownAddinfo.uuid = '')";

	private FinderPath _finderPathFetchByUUID_G;
	private FinderPath _finderPathCountByUUID_G;

	/**
	 * Returns the osi services trustee bread down addinfo where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchOsiServicesTrusteeBreadDownAddinfoException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching osi services trustee bread down addinfo
	 * @throws NoSuchOsiServicesTrusteeBreadDownAddinfoException if a matching osi services trustee bread down addinfo could not be found
	 */
	@Override
	public OsiServicesTrusteeBreadDownAddinfo findByUUID_G(
			String uuid, long groupId)
		throws NoSuchOsiServicesTrusteeBreadDownAddinfoException {

		OsiServicesTrusteeBreadDownAddinfo osiServicesTrusteeBreadDownAddinfo =
			fetchByUUID_G(uuid, groupId);

		if (osiServicesTrusteeBreadDownAddinfo == null) {
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

			throw new NoSuchOsiServicesTrusteeBreadDownAddinfoException(
				sb.toString());
		}

		return osiServicesTrusteeBreadDownAddinfo;
	}

	/**
	 * Returns the osi services trustee bread down addinfo where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching osi services trustee bread down addinfo, or <code>null</code> if a matching osi services trustee bread down addinfo could not be found
	 */
	@Override
	public OsiServicesTrusteeBreadDownAddinfo fetchByUUID_G(
		String uuid, long groupId) {

		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the osi services trustee bread down addinfo where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching osi services trustee bread down addinfo, or <code>null</code> if a matching osi services trustee bread down addinfo could not be found
	 */
	@Override
	public OsiServicesTrusteeBreadDownAddinfo fetchByUUID_G(
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

		if (result instanceof OsiServicesTrusteeBreadDownAddinfo) {
			OsiServicesTrusteeBreadDownAddinfo
				osiServicesTrusteeBreadDownAddinfo =
					(OsiServicesTrusteeBreadDownAddinfo)result;

			if (!Objects.equals(
					uuid, osiServicesTrusteeBreadDownAddinfo.getUuid()) ||
				(groupId != osiServicesTrusteeBreadDownAddinfo.getGroupId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_OSISERVICESTRUSTEEBREADDOWNADDINFO_WHERE);

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

				List<OsiServicesTrusteeBreadDownAddinfo> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByUUID_G, finderArgs, list);
					}
				}
				else {
					OsiServicesTrusteeBreadDownAddinfo
						osiServicesTrusteeBreadDownAddinfo = list.get(0);

					result = osiServicesTrusteeBreadDownAddinfo;

					cacheResult(osiServicesTrusteeBreadDownAddinfo);
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
			return (OsiServicesTrusteeBreadDownAddinfo)result;
		}
	}

	/**
	 * Removes the osi services trustee bread down addinfo where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the osi services trustee bread down addinfo that was removed
	 */
	@Override
	public OsiServicesTrusteeBreadDownAddinfo removeByUUID_G(
			String uuid, long groupId)
		throws NoSuchOsiServicesTrusteeBreadDownAddinfoException {

		OsiServicesTrusteeBreadDownAddinfo osiServicesTrusteeBreadDownAddinfo =
			findByUUID_G(uuid, groupId);

		return remove(osiServicesTrusteeBreadDownAddinfo);
	}

	/**
	 * Returns the number of osi services trustee bread down addinfos where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching osi services trustee bread down addinfos
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUUID_G;

		Object[] finderArgs = new Object[] {uuid, groupId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_OSISERVICESTRUSTEEBREADDOWNADDINFO_WHERE);

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
		"osiServicesTrusteeBreadDownAddinfo.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_G_UUID_3 =
		"(osiServicesTrusteeBreadDownAddinfo.uuid IS NULL OR osiServicesTrusteeBreadDownAddinfo.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 =
		"osiServicesTrusteeBreadDownAddinfo.groupId = ?";

	private FinderPath _finderPathWithPaginationFindByUuid_C;
	private FinderPath _finderPathWithoutPaginationFindByUuid_C;
	private FinderPath _finderPathCountByUuid_C;

	/**
	 * Returns all the osi services trustee bread down addinfos where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching osi services trustee bread down addinfos
	 */
	@Override
	public List<OsiServicesTrusteeBreadDownAddinfo> findByUuid_C(
		String uuid, long companyId) {

		return findByUuid_C(
			uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the osi services trustee bread down addinfos where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesTrusteeBreadDownAddinfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of osi services trustee bread down addinfos
	 * @param end the upper bound of the range of osi services trustee bread down addinfos (not inclusive)
	 * @return the range of matching osi services trustee bread down addinfos
	 */
	@Override
	public List<OsiServicesTrusteeBreadDownAddinfo> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return findByUuid_C(uuid, companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the osi services trustee bread down addinfos where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesTrusteeBreadDownAddinfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of osi services trustee bread down addinfos
	 * @param end the upper bound of the range of osi services trustee bread down addinfos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching osi services trustee bread down addinfos
	 */
	@Override
	public List<OsiServicesTrusteeBreadDownAddinfo> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<OsiServicesTrusteeBreadDownAddinfo>
			orderByComparator) {

		return findByUuid_C(
			uuid, companyId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the osi services trustee bread down addinfos where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesTrusteeBreadDownAddinfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of osi services trustee bread down addinfos
	 * @param end the upper bound of the range of osi services trustee bread down addinfos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching osi services trustee bread down addinfos
	 */
	@Override
	public List<OsiServicesTrusteeBreadDownAddinfo> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<OsiServicesTrusteeBreadDownAddinfo> orderByComparator,
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

		List<OsiServicesTrusteeBreadDownAddinfo> list = null;

		if (useFinderCache) {
			list =
				(List<OsiServicesTrusteeBreadDownAddinfo>)finderCache.getResult(
					finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (OsiServicesTrusteeBreadDownAddinfo
						osiServicesTrusteeBreadDownAddinfo : list) {

					if (!uuid.equals(
							osiServicesTrusteeBreadDownAddinfo.getUuid()) ||
						(companyId !=
							osiServicesTrusteeBreadDownAddinfo.
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

			sb.append(_SQL_SELECT_OSISERVICESTRUSTEEBREADDOWNADDINFO_WHERE);

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
					OsiServicesTrusteeBreadDownAddinfoModelImpl.ORDER_BY_JPQL);
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

				list = (List<OsiServicesTrusteeBreadDownAddinfo>)QueryUtil.list(
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
	 * Returns the first osi services trustee bread down addinfo in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi services trustee bread down addinfo
	 * @throws NoSuchOsiServicesTrusteeBreadDownAddinfoException if a matching osi services trustee bread down addinfo could not be found
	 */
	@Override
	public OsiServicesTrusteeBreadDownAddinfo findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<OsiServicesTrusteeBreadDownAddinfo>
				orderByComparator)
		throws NoSuchOsiServicesTrusteeBreadDownAddinfoException {

		OsiServicesTrusteeBreadDownAddinfo osiServicesTrusteeBreadDownAddinfo =
			fetchByUuid_C_First(uuid, companyId, orderByComparator);

		if (osiServicesTrusteeBreadDownAddinfo != null) {
			return osiServicesTrusteeBreadDownAddinfo;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchOsiServicesTrusteeBreadDownAddinfoException(
			sb.toString());
	}

	/**
	 * Returns the first osi services trustee bread down addinfo in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi services trustee bread down addinfo, or <code>null</code> if a matching osi services trustee bread down addinfo could not be found
	 */
	@Override
	public OsiServicesTrusteeBreadDownAddinfo fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<OsiServicesTrusteeBreadDownAddinfo>
			orderByComparator) {

		List<OsiServicesTrusteeBreadDownAddinfo> list = findByUuid_C(
			uuid, companyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last osi services trustee bread down addinfo in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi services trustee bread down addinfo
	 * @throws NoSuchOsiServicesTrusteeBreadDownAddinfoException if a matching osi services trustee bread down addinfo could not be found
	 */
	@Override
	public OsiServicesTrusteeBreadDownAddinfo findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<OsiServicesTrusteeBreadDownAddinfo>
				orderByComparator)
		throws NoSuchOsiServicesTrusteeBreadDownAddinfoException {

		OsiServicesTrusteeBreadDownAddinfo osiServicesTrusteeBreadDownAddinfo =
			fetchByUuid_C_Last(uuid, companyId, orderByComparator);

		if (osiServicesTrusteeBreadDownAddinfo != null) {
			return osiServicesTrusteeBreadDownAddinfo;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchOsiServicesTrusteeBreadDownAddinfoException(
			sb.toString());
	}

	/**
	 * Returns the last osi services trustee bread down addinfo in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi services trustee bread down addinfo, or <code>null</code> if a matching osi services trustee bread down addinfo could not be found
	 */
	@Override
	public OsiServicesTrusteeBreadDownAddinfo fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<OsiServicesTrusteeBreadDownAddinfo>
			orderByComparator) {

		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<OsiServicesTrusteeBreadDownAddinfo> list = findByUuid_C(
			uuid, companyId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the osi services trustee bread down addinfos before and after the current osi services trustee bread down addinfo in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param osiTrusId the primary key of the current osi services trustee bread down addinfo
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next osi services trustee bread down addinfo
	 * @throws NoSuchOsiServicesTrusteeBreadDownAddinfoException if a osi services trustee bread down addinfo with the primary key could not be found
	 */
	@Override
	public OsiServicesTrusteeBreadDownAddinfo[] findByUuid_C_PrevAndNext(
			long osiTrusId, String uuid, long companyId,
			OrderByComparator<OsiServicesTrusteeBreadDownAddinfo>
				orderByComparator)
		throws NoSuchOsiServicesTrusteeBreadDownAddinfoException {

		uuid = Objects.toString(uuid, "");

		OsiServicesTrusteeBreadDownAddinfo osiServicesTrusteeBreadDownAddinfo =
			findByPrimaryKey(osiTrusId);

		Session session = null;

		try {
			session = openSession();

			OsiServicesTrusteeBreadDownAddinfo[] array =
				new OsiServicesTrusteeBreadDownAddinfoImpl[3];

			array[0] = getByUuid_C_PrevAndNext(
				session, osiServicesTrusteeBreadDownAddinfo, uuid, companyId,
				orderByComparator, true);

			array[1] = osiServicesTrusteeBreadDownAddinfo;

			array[2] = getByUuid_C_PrevAndNext(
				session, osiServicesTrusteeBreadDownAddinfo, uuid, companyId,
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

	protected OsiServicesTrusteeBreadDownAddinfo getByUuid_C_PrevAndNext(
		Session session,
		OsiServicesTrusteeBreadDownAddinfo osiServicesTrusteeBreadDownAddinfo,
		String uuid, long companyId,
		OrderByComparator<OsiServicesTrusteeBreadDownAddinfo> orderByComparator,
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

		sb.append(_SQL_SELECT_OSISERVICESTRUSTEEBREADDOWNADDINFO_WHERE);

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
				OsiServicesTrusteeBreadDownAddinfoModelImpl.ORDER_BY_JPQL);
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
						osiServicesTrusteeBreadDownAddinfo)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<OsiServicesTrusteeBreadDownAddinfo> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the osi services trustee bread down addinfos where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (OsiServicesTrusteeBreadDownAddinfo
				osiServicesTrusteeBreadDownAddinfo :
					findByUuid_C(
						uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
						null)) {

			remove(osiServicesTrusteeBreadDownAddinfo);
		}
	}

	/**
	 * Returns the number of osi services trustee bread down addinfos where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching osi services trustee bread down addinfos
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid_C;

		Object[] finderArgs = new Object[] {uuid, companyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_OSISERVICESTRUSTEEBREADDOWNADDINFO_WHERE);

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
		"osiServicesTrusteeBreadDownAddinfo.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_C_UUID_3 =
		"(osiServicesTrusteeBreadDownAddinfo.uuid IS NULL OR osiServicesTrusteeBreadDownAddinfo.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 =
		"osiServicesTrusteeBreadDownAddinfo.companyId = ?";

	private FinderPath _finderPathFetchBygetOsiServicesById;
	private FinderPath _finderPathCountBygetOsiServicesById;

	/**
	 * Returns the osi services trustee bread down addinfo where osiServicesApplicationId = &#63; or throws a <code>NoSuchOsiServicesTrusteeBreadDownAddinfoException</code> if it could not be found.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @return the matching osi services trustee bread down addinfo
	 * @throws NoSuchOsiServicesTrusteeBreadDownAddinfoException if a matching osi services trustee bread down addinfo could not be found
	 */
	@Override
	public OsiServicesTrusteeBreadDownAddinfo findBygetOsiServicesById(
			long osiServicesApplicationId)
		throws NoSuchOsiServicesTrusteeBreadDownAddinfoException {

		OsiServicesTrusteeBreadDownAddinfo osiServicesTrusteeBreadDownAddinfo =
			fetchBygetOsiServicesById(osiServicesApplicationId);

		if (osiServicesTrusteeBreadDownAddinfo == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("osiServicesApplicationId=");
			sb.append(osiServicesApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchOsiServicesTrusteeBreadDownAddinfoException(
				sb.toString());
		}

		return osiServicesTrusteeBreadDownAddinfo;
	}

	/**
	 * Returns the osi services trustee bread down addinfo where osiServicesApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @return the matching osi services trustee bread down addinfo, or <code>null</code> if a matching osi services trustee bread down addinfo could not be found
	 */
	@Override
	public OsiServicesTrusteeBreadDownAddinfo fetchBygetOsiServicesById(
		long osiServicesApplicationId) {

		return fetchBygetOsiServicesById(osiServicesApplicationId, true);
	}

	/**
	 * Returns the osi services trustee bread down addinfo where osiServicesApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching osi services trustee bread down addinfo, or <code>null</code> if a matching osi services trustee bread down addinfo could not be found
	 */
	@Override
	public OsiServicesTrusteeBreadDownAddinfo fetchBygetOsiServicesById(
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

		if (result instanceof OsiServicesTrusteeBreadDownAddinfo) {
			OsiServicesTrusteeBreadDownAddinfo
				osiServicesTrusteeBreadDownAddinfo =
					(OsiServicesTrusteeBreadDownAddinfo)result;

			if (osiServicesApplicationId !=
					osiServicesTrusteeBreadDownAddinfo.
						getOsiServicesApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_OSISERVICESTRUSTEEBREADDOWNADDINFO_WHERE);

			sb.append(
				_FINDER_COLUMN_GETOSISERVICESBYID_OSISERVICESAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(osiServicesApplicationId);

				List<OsiServicesTrusteeBreadDownAddinfo> list = query.list();

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
								"OsiServicesTrusteeBreadDownAddinfoPersistenceImpl.fetchBygetOsiServicesById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					OsiServicesTrusteeBreadDownAddinfo
						osiServicesTrusteeBreadDownAddinfo = list.get(0);

					result = osiServicesTrusteeBreadDownAddinfo;

					cacheResult(osiServicesTrusteeBreadDownAddinfo);
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
			return (OsiServicesTrusteeBreadDownAddinfo)result;
		}
	}

	/**
	 * Removes the osi services trustee bread down addinfo where osiServicesApplicationId = &#63; from the database.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @return the osi services trustee bread down addinfo that was removed
	 */
	@Override
	public OsiServicesTrusteeBreadDownAddinfo removeBygetOsiServicesById(
			long osiServicesApplicationId)
		throws NoSuchOsiServicesTrusteeBreadDownAddinfoException {

		OsiServicesTrusteeBreadDownAddinfo osiServicesTrusteeBreadDownAddinfo =
			findBygetOsiServicesById(osiServicesApplicationId);

		return remove(osiServicesTrusteeBreadDownAddinfo);
	}

	/**
	 * Returns the number of osi services trustee bread down addinfos where osiServicesApplicationId = &#63;.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @return the number of matching osi services trustee bread down addinfos
	 */
	@Override
	public int countBygetOsiServicesById(long osiServicesApplicationId) {
		FinderPath finderPath = _finderPathCountBygetOsiServicesById;

		Object[] finderArgs = new Object[] {osiServicesApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_OSISERVICESTRUSTEEBREADDOWNADDINFO_WHERE);

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
			"osiServicesTrusteeBreadDownAddinfo.osiServicesApplicationId = ?";

	private FinderPath _finderPathWithPaginationFindBygetOsiServices_Data_By_Id;
	private FinderPath
		_finderPathWithoutPaginationFindBygetOsiServices_Data_By_Id;
	private FinderPath _finderPathCountBygetOsiServices_Data_By_Id;

	/**
	 * Returns all the osi services trustee bread down addinfos where osiServicesApplicationId = &#63;.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @return the matching osi services trustee bread down addinfos
	 */
	@Override
	public List<OsiServicesTrusteeBreadDownAddinfo>
		findBygetOsiServices_Data_By_Id(long osiServicesApplicationId) {

		return findBygetOsiServices_Data_By_Id(
			osiServicesApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the osi services trustee bread down addinfos where osiServicesApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesTrusteeBreadDownAddinfoModelImpl</code>.
	 * </p>
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @param start the lower bound of the range of osi services trustee bread down addinfos
	 * @param end the upper bound of the range of osi services trustee bread down addinfos (not inclusive)
	 * @return the range of matching osi services trustee bread down addinfos
	 */
	@Override
	public List<OsiServicesTrusteeBreadDownAddinfo>
		findBygetOsiServices_Data_By_Id(
			long osiServicesApplicationId, int start, int end) {

		return findBygetOsiServices_Data_By_Id(
			osiServicesApplicationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the osi services trustee bread down addinfos where osiServicesApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesTrusteeBreadDownAddinfoModelImpl</code>.
	 * </p>
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @param start the lower bound of the range of osi services trustee bread down addinfos
	 * @param end the upper bound of the range of osi services trustee bread down addinfos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching osi services trustee bread down addinfos
	 */
	@Override
	public List<OsiServicesTrusteeBreadDownAddinfo>
		findBygetOsiServices_Data_By_Id(
			long osiServicesApplicationId, int start, int end,
			OrderByComparator<OsiServicesTrusteeBreadDownAddinfo>
				orderByComparator) {

		return findBygetOsiServices_Data_By_Id(
			osiServicesApplicationId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the osi services trustee bread down addinfos where osiServicesApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesTrusteeBreadDownAddinfoModelImpl</code>.
	 * </p>
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @param start the lower bound of the range of osi services trustee bread down addinfos
	 * @param end the upper bound of the range of osi services trustee bread down addinfos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching osi services trustee bread down addinfos
	 */
	@Override
	public List<OsiServicesTrusteeBreadDownAddinfo>
		findBygetOsiServices_Data_By_Id(
			long osiServicesApplicationId, int start, int end,
			OrderByComparator<OsiServicesTrusteeBreadDownAddinfo>
				orderByComparator,
			boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetOsiServices_Data_By_Id;
				finderArgs = new Object[] {osiServicesApplicationId};
			}
		}
		else if (useFinderCache) {
			finderPath =
				_finderPathWithPaginationFindBygetOsiServices_Data_By_Id;
			finderArgs = new Object[] {
				osiServicesApplicationId, start, end, orderByComparator
			};
		}

		List<OsiServicesTrusteeBreadDownAddinfo> list = null;

		if (useFinderCache) {
			list =
				(List<OsiServicesTrusteeBreadDownAddinfo>)finderCache.getResult(
					finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (OsiServicesTrusteeBreadDownAddinfo
						osiServicesTrusteeBreadDownAddinfo : list) {

					if (osiServicesApplicationId !=
							osiServicesTrusteeBreadDownAddinfo.
								getOsiServicesApplicationId()) {

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

			sb.append(_SQL_SELECT_OSISERVICESTRUSTEEBREADDOWNADDINFO_WHERE);

			sb.append(
				_FINDER_COLUMN_GETOSISERVICES_DATA_BY_ID_OSISERVICESAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(
					OsiServicesTrusteeBreadDownAddinfoModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(osiServicesApplicationId);

				list = (List<OsiServicesTrusteeBreadDownAddinfo>)QueryUtil.list(
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
	 * Returns the first osi services trustee bread down addinfo in the ordered set where osiServicesApplicationId = &#63;.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi services trustee bread down addinfo
	 * @throws NoSuchOsiServicesTrusteeBreadDownAddinfoException if a matching osi services trustee bread down addinfo could not be found
	 */
	@Override
	public OsiServicesTrusteeBreadDownAddinfo
			findBygetOsiServices_Data_By_Id_First(
				long osiServicesApplicationId,
				OrderByComparator<OsiServicesTrusteeBreadDownAddinfo>
					orderByComparator)
		throws NoSuchOsiServicesTrusteeBreadDownAddinfoException {

		OsiServicesTrusteeBreadDownAddinfo osiServicesTrusteeBreadDownAddinfo =
			fetchBygetOsiServices_Data_By_Id_First(
				osiServicesApplicationId, orderByComparator);

		if (osiServicesTrusteeBreadDownAddinfo != null) {
			return osiServicesTrusteeBreadDownAddinfo;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("osiServicesApplicationId=");
		sb.append(osiServicesApplicationId);

		sb.append("}");

		throw new NoSuchOsiServicesTrusteeBreadDownAddinfoException(
			sb.toString());
	}

	/**
	 * Returns the first osi services trustee bread down addinfo in the ordered set where osiServicesApplicationId = &#63;.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi services trustee bread down addinfo, or <code>null</code> if a matching osi services trustee bread down addinfo could not be found
	 */
	@Override
	public OsiServicesTrusteeBreadDownAddinfo
		fetchBygetOsiServices_Data_By_Id_First(
			long osiServicesApplicationId,
			OrderByComparator<OsiServicesTrusteeBreadDownAddinfo>
				orderByComparator) {

		List<OsiServicesTrusteeBreadDownAddinfo> list =
			findBygetOsiServices_Data_By_Id(
				osiServicesApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last osi services trustee bread down addinfo in the ordered set where osiServicesApplicationId = &#63;.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi services trustee bread down addinfo
	 * @throws NoSuchOsiServicesTrusteeBreadDownAddinfoException if a matching osi services trustee bread down addinfo could not be found
	 */
	@Override
	public OsiServicesTrusteeBreadDownAddinfo
			findBygetOsiServices_Data_By_Id_Last(
				long osiServicesApplicationId,
				OrderByComparator<OsiServicesTrusteeBreadDownAddinfo>
					orderByComparator)
		throws NoSuchOsiServicesTrusteeBreadDownAddinfoException {

		OsiServicesTrusteeBreadDownAddinfo osiServicesTrusteeBreadDownAddinfo =
			fetchBygetOsiServices_Data_By_Id_Last(
				osiServicesApplicationId, orderByComparator);

		if (osiServicesTrusteeBreadDownAddinfo != null) {
			return osiServicesTrusteeBreadDownAddinfo;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("osiServicesApplicationId=");
		sb.append(osiServicesApplicationId);

		sb.append("}");

		throw new NoSuchOsiServicesTrusteeBreadDownAddinfoException(
			sb.toString());
	}

	/**
	 * Returns the last osi services trustee bread down addinfo in the ordered set where osiServicesApplicationId = &#63;.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi services trustee bread down addinfo, or <code>null</code> if a matching osi services trustee bread down addinfo could not be found
	 */
	@Override
	public OsiServicesTrusteeBreadDownAddinfo
		fetchBygetOsiServices_Data_By_Id_Last(
			long osiServicesApplicationId,
			OrderByComparator<OsiServicesTrusteeBreadDownAddinfo>
				orderByComparator) {

		int count = countBygetOsiServices_Data_By_Id(osiServicesApplicationId);

		if (count == 0) {
			return null;
		}

		List<OsiServicesTrusteeBreadDownAddinfo> list =
			findBygetOsiServices_Data_By_Id(
				osiServicesApplicationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the osi services trustee bread down addinfos before and after the current osi services trustee bread down addinfo in the ordered set where osiServicesApplicationId = &#63;.
	 *
	 * @param osiTrusId the primary key of the current osi services trustee bread down addinfo
	 * @param osiServicesApplicationId the osi services application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next osi services trustee bread down addinfo
	 * @throws NoSuchOsiServicesTrusteeBreadDownAddinfoException if a osi services trustee bread down addinfo with the primary key could not be found
	 */
	@Override
	public OsiServicesTrusteeBreadDownAddinfo[]
			findBygetOsiServices_Data_By_Id_PrevAndNext(
				long osiTrusId, long osiServicesApplicationId,
				OrderByComparator<OsiServicesTrusteeBreadDownAddinfo>
					orderByComparator)
		throws NoSuchOsiServicesTrusteeBreadDownAddinfoException {

		OsiServicesTrusteeBreadDownAddinfo osiServicesTrusteeBreadDownAddinfo =
			findByPrimaryKey(osiTrusId);

		Session session = null;

		try {
			session = openSession();

			OsiServicesTrusteeBreadDownAddinfo[] array =
				new OsiServicesTrusteeBreadDownAddinfoImpl[3];

			array[0] = getBygetOsiServices_Data_By_Id_PrevAndNext(
				session, osiServicesTrusteeBreadDownAddinfo,
				osiServicesApplicationId, orderByComparator, true);

			array[1] = osiServicesTrusteeBreadDownAddinfo;

			array[2] = getBygetOsiServices_Data_By_Id_PrevAndNext(
				session, osiServicesTrusteeBreadDownAddinfo,
				osiServicesApplicationId, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected OsiServicesTrusteeBreadDownAddinfo
		getBygetOsiServices_Data_By_Id_PrevAndNext(
			Session session,
			OsiServicesTrusteeBreadDownAddinfo
				osiServicesTrusteeBreadDownAddinfo,
			long osiServicesApplicationId,
			OrderByComparator<OsiServicesTrusteeBreadDownAddinfo>
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

		sb.append(_SQL_SELECT_OSISERVICESTRUSTEEBREADDOWNADDINFO_WHERE);

		sb.append(
			_FINDER_COLUMN_GETOSISERVICES_DATA_BY_ID_OSISERVICESAPPLICATIONID_2);

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
				OsiServicesTrusteeBreadDownAddinfoModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(osiServicesApplicationId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						osiServicesTrusteeBreadDownAddinfo)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<OsiServicesTrusteeBreadDownAddinfo> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the osi services trustee bread down addinfos where osiServicesApplicationId = &#63; from the database.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 */
	@Override
	public void removeBygetOsiServices_Data_By_Id(
		long osiServicesApplicationId) {

		for (OsiServicesTrusteeBreadDownAddinfo
				osiServicesTrusteeBreadDownAddinfo :
					findBygetOsiServices_Data_By_Id(
						osiServicesApplicationId, QueryUtil.ALL_POS,
						QueryUtil.ALL_POS, null)) {

			remove(osiServicesTrusteeBreadDownAddinfo);
		}
	}

	/**
	 * Returns the number of osi services trustee bread down addinfos where osiServicesApplicationId = &#63;.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @return the number of matching osi services trustee bread down addinfos
	 */
	@Override
	public int countBygetOsiServices_Data_By_Id(long osiServicesApplicationId) {
		FinderPath finderPath = _finderPathCountBygetOsiServices_Data_By_Id;

		Object[] finderArgs = new Object[] {osiServicesApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_OSISERVICESTRUSTEEBREADDOWNADDINFO_WHERE);

			sb.append(
				_FINDER_COLUMN_GETOSISERVICES_DATA_BY_ID_OSISERVICESAPPLICATIONID_2);

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
		_FINDER_COLUMN_GETOSISERVICES_DATA_BY_ID_OSISERVICESAPPLICATIONID_2 =
			"osiServicesTrusteeBreadDownAddinfo.osiServicesApplicationId = ?";

	public OsiServicesTrusteeBreadDownAddinfoPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");

		setDBColumnNames(dbColumnNames);

		setModelClass(OsiServicesTrusteeBreadDownAddinfo.class);

		setModelImplClass(OsiServicesTrusteeBreadDownAddinfoImpl.class);
		setModelPKClass(long.class);

		setTable(OsiServicesTrusteeBreadDownAddinfoTable.INSTANCE);
	}

	/**
	 * Caches the osi services trustee bread down addinfo in the entity cache if it is enabled.
	 *
	 * @param osiServicesTrusteeBreadDownAddinfo the osi services trustee bread down addinfo
	 */
	@Override
	public void cacheResult(
		OsiServicesTrusteeBreadDownAddinfo osiServicesTrusteeBreadDownAddinfo) {

		entityCache.putResult(
			OsiServicesTrusteeBreadDownAddinfoImpl.class,
			osiServicesTrusteeBreadDownAddinfo.getPrimaryKey(),
			osiServicesTrusteeBreadDownAddinfo);

		finderCache.putResult(
			_finderPathFetchByUUID_G,
			new Object[] {
				osiServicesTrusteeBreadDownAddinfo.getUuid(),
				osiServicesTrusteeBreadDownAddinfo.getGroupId()
			},
			osiServicesTrusteeBreadDownAddinfo);

		finderCache.putResult(
			_finderPathFetchBygetOsiServicesById,
			new Object[] {
				osiServicesTrusteeBreadDownAddinfo.getOsiServicesApplicationId()
			},
			osiServicesTrusteeBreadDownAddinfo);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the osi services trustee bread down addinfos in the entity cache if it is enabled.
	 *
	 * @param osiServicesTrusteeBreadDownAddinfos the osi services trustee bread down addinfos
	 */
	@Override
	public void cacheResult(
		List<OsiServicesTrusteeBreadDownAddinfo>
			osiServicesTrusteeBreadDownAddinfos) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (osiServicesTrusteeBreadDownAddinfos.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (OsiServicesTrusteeBreadDownAddinfo
				osiServicesTrusteeBreadDownAddinfo :
					osiServicesTrusteeBreadDownAddinfos) {

			if (entityCache.getResult(
					OsiServicesTrusteeBreadDownAddinfoImpl.class,
					osiServicesTrusteeBreadDownAddinfo.getPrimaryKey()) ==
						null) {

				cacheResult(osiServicesTrusteeBreadDownAddinfo);
			}
		}
	}

	/**
	 * Clears the cache for all osi services trustee bread down addinfos.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(OsiServicesTrusteeBreadDownAddinfoImpl.class);

		finderCache.clearCache(OsiServicesTrusteeBreadDownAddinfoImpl.class);
	}

	/**
	 * Clears the cache for the osi services trustee bread down addinfo.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		OsiServicesTrusteeBreadDownAddinfo osiServicesTrusteeBreadDownAddinfo) {

		entityCache.removeResult(
			OsiServicesTrusteeBreadDownAddinfoImpl.class,
			osiServicesTrusteeBreadDownAddinfo);
	}

	@Override
	public void clearCache(
		List<OsiServicesTrusteeBreadDownAddinfo>
			osiServicesTrusteeBreadDownAddinfos) {

		for (OsiServicesTrusteeBreadDownAddinfo
				osiServicesTrusteeBreadDownAddinfo :
					osiServicesTrusteeBreadDownAddinfos) {

			entityCache.removeResult(
				OsiServicesTrusteeBreadDownAddinfoImpl.class,
				osiServicesTrusteeBreadDownAddinfo);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(OsiServicesTrusteeBreadDownAddinfoImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				OsiServicesTrusteeBreadDownAddinfoImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		OsiServicesTrusteeBreadDownAddinfoModelImpl
			osiServicesTrusteeBreadDownAddinfoModelImpl) {

		Object[] args = new Object[] {
			osiServicesTrusteeBreadDownAddinfoModelImpl.getUuid(),
			osiServicesTrusteeBreadDownAddinfoModelImpl.getGroupId()
		};

		finderCache.putResult(_finderPathCountByUUID_G, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchByUUID_G, args,
			osiServicesTrusteeBreadDownAddinfoModelImpl);

		args = new Object[] {
			osiServicesTrusteeBreadDownAddinfoModelImpl.
				getOsiServicesApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetOsiServicesById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetOsiServicesById, args,
			osiServicesTrusteeBreadDownAddinfoModelImpl);
	}

	/**
	 * Creates a new osi services trustee bread down addinfo with the primary key. Does not add the osi services trustee bread down addinfo to the database.
	 *
	 * @param osiTrusId the primary key for the new osi services trustee bread down addinfo
	 * @return the new osi services trustee bread down addinfo
	 */
	@Override
	public OsiServicesTrusteeBreadDownAddinfo create(long osiTrusId) {
		OsiServicesTrusteeBreadDownAddinfo osiServicesTrusteeBreadDownAddinfo =
			new OsiServicesTrusteeBreadDownAddinfoImpl();

		osiServicesTrusteeBreadDownAddinfo.setNew(true);
		osiServicesTrusteeBreadDownAddinfo.setPrimaryKey(osiTrusId);

		String uuid = PortalUUIDUtil.generate();

		osiServicesTrusteeBreadDownAddinfo.setUuid(uuid);

		osiServicesTrusteeBreadDownAddinfo.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return osiServicesTrusteeBreadDownAddinfo;
	}

	/**
	 * Removes the osi services trustee bread down addinfo with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param osiTrusId the primary key of the osi services trustee bread down addinfo
	 * @return the osi services trustee bread down addinfo that was removed
	 * @throws NoSuchOsiServicesTrusteeBreadDownAddinfoException if a osi services trustee bread down addinfo with the primary key could not be found
	 */
	@Override
	public OsiServicesTrusteeBreadDownAddinfo remove(long osiTrusId)
		throws NoSuchOsiServicesTrusteeBreadDownAddinfoException {

		return remove((Serializable)osiTrusId);
	}

	/**
	 * Removes the osi services trustee bread down addinfo with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the osi services trustee bread down addinfo
	 * @return the osi services trustee bread down addinfo that was removed
	 * @throws NoSuchOsiServicesTrusteeBreadDownAddinfoException if a osi services trustee bread down addinfo with the primary key could not be found
	 */
	@Override
	public OsiServicesTrusteeBreadDownAddinfo remove(Serializable primaryKey)
		throws NoSuchOsiServicesTrusteeBreadDownAddinfoException {

		Session session = null;

		try {
			session = openSession();

			OsiServicesTrusteeBreadDownAddinfo
				osiServicesTrusteeBreadDownAddinfo =
					(OsiServicesTrusteeBreadDownAddinfo)session.get(
						OsiServicesTrusteeBreadDownAddinfoImpl.class,
						primaryKey);

			if (osiServicesTrusteeBreadDownAddinfo == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchOsiServicesTrusteeBreadDownAddinfoException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(osiServicesTrusteeBreadDownAddinfo);
		}
		catch (NoSuchOsiServicesTrusteeBreadDownAddinfoException
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
	protected OsiServicesTrusteeBreadDownAddinfo removeImpl(
		OsiServicesTrusteeBreadDownAddinfo osiServicesTrusteeBreadDownAddinfo) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(osiServicesTrusteeBreadDownAddinfo)) {
				osiServicesTrusteeBreadDownAddinfo =
					(OsiServicesTrusteeBreadDownAddinfo)session.get(
						OsiServicesTrusteeBreadDownAddinfoImpl.class,
						osiServicesTrusteeBreadDownAddinfo.getPrimaryKeyObj());
			}

			if (osiServicesTrusteeBreadDownAddinfo != null) {
				session.delete(osiServicesTrusteeBreadDownAddinfo);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (osiServicesTrusteeBreadDownAddinfo != null) {
			clearCache(osiServicesTrusteeBreadDownAddinfo);
		}

		return osiServicesTrusteeBreadDownAddinfo;
	}

	@Override
	public OsiServicesTrusteeBreadDownAddinfo updateImpl(
		OsiServicesTrusteeBreadDownAddinfo osiServicesTrusteeBreadDownAddinfo) {

		boolean isNew = osiServicesTrusteeBreadDownAddinfo.isNew();

		if (!(osiServicesTrusteeBreadDownAddinfo instanceof
				OsiServicesTrusteeBreadDownAddinfoModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(
					osiServicesTrusteeBreadDownAddinfo.getClass())) {

				invocationHandler = ProxyUtil.getInvocationHandler(
					osiServicesTrusteeBreadDownAddinfo);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in osiServicesTrusteeBreadDownAddinfo proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom OsiServicesTrusteeBreadDownAddinfo implementation " +
					osiServicesTrusteeBreadDownAddinfo.getClass());
		}

		OsiServicesTrusteeBreadDownAddinfoModelImpl
			osiServicesTrusteeBreadDownAddinfoModelImpl =
				(OsiServicesTrusteeBreadDownAddinfoModelImpl)
					osiServicesTrusteeBreadDownAddinfo;

		if (Validator.isNull(osiServicesTrusteeBreadDownAddinfo.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			osiServicesTrusteeBreadDownAddinfo.setUuid(uuid);
		}

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew &&
			(osiServicesTrusteeBreadDownAddinfo.getCreateDate() == null)) {

			if (serviceContext == null) {
				osiServicesTrusteeBreadDownAddinfo.setCreateDate(date);
			}
			else {
				osiServicesTrusteeBreadDownAddinfo.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!osiServicesTrusteeBreadDownAddinfoModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				osiServicesTrusteeBreadDownAddinfo.setModifiedDate(date);
			}
			else {
				osiServicesTrusteeBreadDownAddinfo.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(osiServicesTrusteeBreadDownAddinfo);
			}
			else {
				osiServicesTrusteeBreadDownAddinfo =
					(OsiServicesTrusteeBreadDownAddinfo)session.merge(
						osiServicesTrusteeBreadDownAddinfo);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			OsiServicesTrusteeBreadDownAddinfoImpl.class,
			osiServicesTrusteeBreadDownAddinfoModelImpl, false, true);

		cacheUniqueFindersCache(osiServicesTrusteeBreadDownAddinfoModelImpl);

		if (isNew) {
			osiServicesTrusteeBreadDownAddinfo.setNew(false);
		}

		osiServicesTrusteeBreadDownAddinfo.resetOriginalValues();

		return osiServicesTrusteeBreadDownAddinfo;
	}

	/**
	 * Returns the osi services trustee bread down addinfo with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the osi services trustee bread down addinfo
	 * @return the osi services trustee bread down addinfo
	 * @throws NoSuchOsiServicesTrusteeBreadDownAddinfoException if a osi services trustee bread down addinfo with the primary key could not be found
	 */
	@Override
	public OsiServicesTrusteeBreadDownAddinfo findByPrimaryKey(
			Serializable primaryKey)
		throws NoSuchOsiServicesTrusteeBreadDownAddinfoException {

		OsiServicesTrusteeBreadDownAddinfo osiServicesTrusteeBreadDownAddinfo =
			fetchByPrimaryKey(primaryKey);

		if (osiServicesTrusteeBreadDownAddinfo == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchOsiServicesTrusteeBreadDownAddinfoException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return osiServicesTrusteeBreadDownAddinfo;
	}

	/**
	 * Returns the osi services trustee bread down addinfo with the primary key or throws a <code>NoSuchOsiServicesTrusteeBreadDownAddinfoException</code> if it could not be found.
	 *
	 * @param osiTrusId the primary key of the osi services trustee bread down addinfo
	 * @return the osi services trustee bread down addinfo
	 * @throws NoSuchOsiServicesTrusteeBreadDownAddinfoException if a osi services trustee bread down addinfo with the primary key could not be found
	 */
	@Override
	public OsiServicesTrusteeBreadDownAddinfo findByPrimaryKey(long osiTrusId)
		throws NoSuchOsiServicesTrusteeBreadDownAddinfoException {

		return findByPrimaryKey((Serializable)osiTrusId);
	}

	/**
	 * Returns the osi services trustee bread down addinfo with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param osiTrusId the primary key of the osi services trustee bread down addinfo
	 * @return the osi services trustee bread down addinfo, or <code>null</code> if a osi services trustee bread down addinfo with the primary key could not be found
	 */
	@Override
	public OsiServicesTrusteeBreadDownAddinfo fetchByPrimaryKey(
		long osiTrusId) {

		return fetchByPrimaryKey((Serializable)osiTrusId);
	}

	/**
	 * Returns all the osi services trustee bread down addinfos.
	 *
	 * @return the osi services trustee bread down addinfos
	 */
	@Override
	public List<OsiServicesTrusteeBreadDownAddinfo> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the osi services trustee bread down addinfos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesTrusteeBreadDownAddinfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi services trustee bread down addinfos
	 * @param end the upper bound of the range of osi services trustee bread down addinfos (not inclusive)
	 * @return the range of osi services trustee bread down addinfos
	 */
	@Override
	public List<OsiServicesTrusteeBreadDownAddinfo> findAll(
		int start, int end) {

		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the osi services trustee bread down addinfos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesTrusteeBreadDownAddinfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi services trustee bread down addinfos
	 * @param end the upper bound of the range of osi services trustee bread down addinfos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of osi services trustee bread down addinfos
	 */
	@Override
	public List<OsiServicesTrusteeBreadDownAddinfo> findAll(
		int start, int end,
		OrderByComparator<OsiServicesTrusteeBreadDownAddinfo>
			orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the osi services trustee bread down addinfos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesTrusteeBreadDownAddinfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi services trustee bread down addinfos
	 * @param end the upper bound of the range of osi services trustee bread down addinfos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of osi services trustee bread down addinfos
	 */
	@Override
	public List<OsiServicesTrusteeBreadDownAddinfo> findAll(
		int start, int end,
		OrderByComparator<OsiServicesTrusteeBreadDownAddinfo> orderByComparator,
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

		List<OsiServicesTrusteeBreadDownAddinfo> list = null;

		if (useFinderCache) {
			list =
				(List<OsiServicesTrusteeBreadDownAddinfo>)finderCache.getResult(
					finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_OSISERVICESTRUSTEEBREADDOWNADDINFO);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_OSISERVICESTRUSTEEBREADDOWNADDINFO;

				sql = sql.concat(
					OsiServicesTrusteeBreadDownAddinfoModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<OsiServicesTrusteeBreadDownAddinfo>)QueryUtil.list(
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
	 * Removes all the osi services trustee bread down addinfos from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (OsiServicesTrusteeBreadDownAddinfo
				osiServicesTrusteeBreadDownAddinfo : findAll()) {

			remove(osiServicesTrusteeBreadDownAddinfo);
		}
	}

	/**
	 * Returns the number of osi services trustee bread down addinfos.
	 *
	 * @return the number of osi services trustee bread down addinfos
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
					_SQL_COUNT_OSISERVICESTRUSTEEBREADDOWNADDINFO);

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
		return "osiTrusId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_OSISERVICESTRUSTEEBREADDOWNADDINFO;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return OsiServicesTrusteeBreadDownAddinfoModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the osi services trustee bread down addinfo persistence.
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

		_finderPathWithPaginationFindBygetOsiServices_Data_By_Id =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
				"findBygetOsiServices_Data_By_Id",
				new String[] {
					Long.class.getName(), Integer.class.getName(),
					Integer.class.getName(), OrderByComparator.class.getName()
				},
				new String[] {"osiServicesApplicationId"}, true);

		_finderPathWithoutPaginationFindBygetOsiServices_Data_By_Id =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
				"findBygetOsiServices_Data_By_Id",
				new String[] {Long.class.getName()},
				new String[] {"osiServicesApplicationId"}, true);

		_finderPathCountBygetOsiServices_Data_By_Id = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetOsiServices_Data_By_Id",
			new String[] {Long.class.getName()},
			new String[] {"osiServicesApplicationId"}, false);

		OsiServicesTrusteeBreadDownAddinfoUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		OsiServicesTrusteeBreadDownAddinfoUtil.setPersistence(null);

		entityCache.removeCache(
			OsiServicesTrusteeBreadDownAddinfoImpl.class.getName());
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

	private static final String _SQL_SELECT_OSISERVICESTRUSTEEBREADDOWNADDINFO =
		"SELECT osiServicesTrusteeBreadDownAddinfo FROM OsiServicesTrusteeBreadDownAddinfo osiServicesTrusteeBreadDownAddinfo";

	private static final String
		_SQL_SELECT_OSISERVICESTRUSTEEBREADDOWNADDINFO_WHERE =
			"SELECT osiServicesTrusteeBreadDownAddinfo FROM OsiServicesTrusteeBreadDownAddinfo osiServicesTrusteeBreadDownAddinfo WHERE ";

	private static final String _SQL_COUNT_OSISERVICESTRUSTEEBREADDOWNADDINFO =
		"SELECT COUNT(osiServicesTrusteeBreadDownAddinfo) FROM OsiServicesTrusteeBreadDownAddinfo osiServicesTrusteeBreadDownAddinfo";

	private static final String
		_SQL_COUNT_OSISERVICESTRUSTEEBREADDOWNADDINFO_WHERE =
			"SELECT COUNT(osiServicesTrusteeBreadDownAddinfo) FROM OsiServicesTrusteeBreadDownAddinfo osiServicesTrusteeBreadDownAddinfo WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"osiServicesTrusteeBreadDownAddinfo.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No OsiServicesTrusteeBreadDownAddinfo exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No OsiServicesTrusteeBreadDownAddinfo exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		OsiServicesTrusteeBreadDownAddinfoPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}