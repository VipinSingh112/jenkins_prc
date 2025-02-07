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

import com.nbp.osi.services.application.form.service.exception.NoSuchOsiServicesTrusteeCompanyinfoException;
import com.nbp.osi.services.application.form.service.model.OsiServicesTrusteeCompanyinfo;
import com.nbp.osi.services.application.form.service.model.OsiServicesTrusteeCompanyinfoTable;
import com.nbp.osi.services.application.form.service.model.impl.OsiServicesTrusteeCompanyinfoImpl;
import com.nbp.osi.services.application.form.service.model.impl.OsiServicesTrusteeCompanyinfoModelImpl;
import com.nbp.osi.services.application.form.service.service.persistence.OsiServicesTrusteeCompanyinfoPersistence;
import com.nbp.osi.services.application.form.service.service.persistence.OsiServicesTrusteeCompanyinfoUtil;
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
 * The persistence implementation for the osi services trustee companyinfo service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = OsiServicesTrusteeCompanyinfoPersistence.class)
public class OsiServicesTrusteeCompanyinfoPersistenceImpl
	extends BasePersistenceImpl<OsiServicesTrusteeCompanyinfo>
	implements OsiServicesTrusteeCompanyinfoPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>OsiServicesTrusteeCompanyinfoUtil</code> to access the osi services trustee companyinfo persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		OsiServicesTrusteeCompanyinfoImpl.class.getName();

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
	 * Returns all the osi services trustee companyinfos where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching osi services trustee companyinfos
	 */
	@Override
	public List<OsiServicesTrusteeCompanyinfo> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the osi services trustee companyinfos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesTrusteeCompanyinfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of osi services trustee companyinfos
	 * @param end the upper bound of the range of osi services trustee companyinfos (not inclusive)
	 * @return the range of matching osi services trustee companyinfos
	 */
	@Override
	public List<OsiServicesTrusteeCompanyinfo> findByUuid(
		String uuid, int start, int end) {

		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the osi services trustee companyinfos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesTrusteeCompanyinfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of osi services trustee companyinfos
	 * @param end the upper bound of the range of osi services trustee companyinfos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching osi services trustee companyinfos
	 */
	@Override
	public List<OsiServicesTrusteeCompanyinfo> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<OsiServicesTrusteeCompanyinfo> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the osi services trustee companyinfos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesTrusteeCompanyinfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of osi services trustee companyinfos
	 * @param end the upper bound of the range of osi services trustee companyinfos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching osi services trustee companyinfos
	 */
	@Override
	public List<OsiServicesTrusteeCompanyinfo> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<OsiServicesTrusteeCompanyinfo> orderByComparator,
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

		List<OsiServicesTrusteeCompanyinfo> list = null;

		if (useFinderCache) {
			list = (List<OsiServicesTrusteeCompanyinfo>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (OsiServicesTrusteeCompanyinfo
						osiServicesTrusteeCompanyinfo : list) {

					if (!uuid.equals(osiServicesTrusteeCompanyinfo.getUuid())) {
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

			sb.append(_SQL_SELECT_OSISERVICESTRUSTEECOMPANYINFO_WHERE);

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
				sb.append(OsiServicesTrusteeCompanyinfoModelImpl.ORDER_BY_JPQL);
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

				list = (List<OsiServicesTrusteeCompanyinfo>)QueryUtil.list(
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
	 * Returns the first osi services trustee companyinfo in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi services trustee companyinfo
	 * @throws NoSuchOsiServicesTrusteeCompanyinfoException if a matching osi services trustee companyinfo could not be found
	 */
	@Override
	public OsiServicesTrusteeCompanyinfo findByUuid_First(
			String uuid,
			OrderByComparator<OsiServicesTrusteeCompanyinfo> orderByComparator)
		throws NoSuchOsiServicesTrusteeCompanyinfoException {

		OsiServicesTrusteeCompanyinfo osiServicesTrusteeCompanyinfo =
			fetchByUuid_First(uuid, orderByComparator);

		if (osiServicesTrusteeCompanyinfo != null) {
			return osiServicesTrusteeCompanyinfo;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchOsiServicesTrusteeCompanyinfoException(sb.toString());
	}

	/**
	 * Returns the first osi services trustee companyinfo in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi services trustee companyinfo, or <code>null</code> if a matching osi services trustee companyinfo could not be found
	 */
	@Override
	public OsiServicesTrusteeCompanyinfo fetchByUuid_First(
		String uuid,
		OrderByComparator<OsiServicesTrusteeCompanyinfo> orderByComparator) {

		List<OsiServicesTrusteeCompanyinfo> list = findByUuid(
			uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last osi services trustee companyinfo in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi services trustee companyinfo
	 * @throws NoSuchOsiServicesTrusteeCompanyinfoException if a matching osi services trustee companyinfo could not be found
	 */
	@Override
	public OsiServicesTrusteeCompanyinfo findByUuid_Last(
			String uuid,
			OrderByComparator<OsiServicesTrusteeCompanyinfo> orderByComparator)
		throws NoSuchOsiServicesTrusteeCompanyinfoException {

		OsiServicesTrusteeCompanyinfo osiServicesTrusteeCompanyinfo =
			fetchByUuid_Last(uuid, orderByComparator);

		if (osiServicesTrusteeCompanyinfo != null) {
			return osiServicesTrusteeCompanyinfo;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchOsiServicesTrusteeCompanyinfoException(sb.toString());
	}

	/**
	 * Returns the last osi services trustee companyinfo in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi services trustee companyinfo, or <code>null</code> if a matching osi services trustee companyinfo could not be found
	 */
	@Override
	public OsiServicesTrusteeCompanyinfo fetchByUuid_Last(
		String uuid,
		OrderByComparator<OsiServicesTrusteeCompanyinfo> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<OsiServicesTrusteeCompanyinfo> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the osi services trustee companyinfos before and after the current osi services trustee companyinfo in the ordered set where uuid = &#63;.
	 *
	 * @param osiTrusId the primary key of the current osi services trustee companyinfo
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next osi services trustee companyinfo
	 * @throws NoSuchOsiServicesTrusteeCompanyinfoException if a osi services trustee companyinfo with the primary key could not be found
	 */
	@Override
	public OsiServicesTrusteeCompanyinfo[] findByUuid_PrevAndNext(
			long osiTrusId, String uuid,
			OrderByComparator<OsiServicesTrusteeCompanyinfo> orderByComparator)
		throws NoSuchOsiServicesTrusteeCompanyinfoException {

		uuid = Objects.toString(uuid, "");

		OsiServicesTrusteeCompanyinfo osiServicesTrusteeCompanyinfo =
			findByPrimaryKey(osiTrusId);

		Session session = null;

		try {
			session = openSession();

			OsiServicesTrusteeCompanyinfo[] array =
				new OsiServicesTrusteeCompanyinfoImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, osiServicesTrusteeCompanyinfo, uuid, orderByComparator,
				true);

			array[1] = osiServicesTrusteeCompanyinfo;

			array[2] = getByUuid_PrevAndNext(
				session, osiServicesTrusteeCompanyinfo, uuid, orderByComparator,
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

	protected OsiServicesTrusteeCompanyinfo getByUuid_PrevAndNext(
		Session session,
		OsiServicesTrusteeCompanyinfo osiServicesTrusteeCompanyinfo,
		String uuid,
		OrderByComparator<OsiServicesTrusteeCompanyinfo> orderByComparator,
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

		sb.append(_SQL_SELECT_OSISERVICESTRUSTEECOMPANYINFO_WHERE);

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
			sb.append(OsiServicesTrusteeCompanyinfoModelImpl.ORDER_BY_JPQL);
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
						osiServicesTrusteeCompanyinfo)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<OsiServicesTrusteeCompanyinfo> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the osi services trustee companyinfos where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (OsiServicesTrusteeCompanyinfo osiServicesTrusteeCompanyinfo :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(osiServicesTrusteeCompanyinfo);
		}
	}

	/**
	 * Returns the number of osi services trustee companyinfos where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching osi services trustee companyinfos
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_OSISERVICESTRUSTEECOMPANYINFO_WHERE);

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
		"osiServicesTrusteeCompanyinfo.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(osiServicesTrusteeCompanyinfo.uuid IS NULL OR osiServicesTrusteeCompanyinfo.uuid = '')";

	private FinderPath _finderPathFetchByUUID_G;
	private FinderPath _finderPathCountByUUID_G;

	/**
	 * Returns the osi services trustee companyinfo where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchOsiServicesTrusteeCompanyinfoException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching osi services trustee companyinfo
	 * @throws NoSuchOsiServicesTrusteeCompanyinfoException if a matching osi services trustee companyinfo could not be found
	 */
	@Override
	public OsiServicesTrusteeCompanyinfo findByUUID_G(String uuid, long groupId)
		throws NoSuchOsiServicesTrusteeCompanyinfoException {

		OsiServicesTrusteeCompanyinfo osiServicesTrusteeCompanyinfo =
			fetchByUUID_G(uuid, groupId);

		if (osiServicesTrusteeCompanyinfo == null) {
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

			throw new NoSuchOsiServicesTrusteeCompanyinfoException(
				sb.toString());
		}

		return osiServicesTrusteeCompanyinfo;
	}

	/**
	 * Returns the osi services trustee companyinfo where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching osi services trustee companyinfo, or <code>null</code> if a matching osi services trustee companyinfo could not be found
	 */
	@Override
	public OsiServicesTrusteeCompanyinfo fetchByUUID_G(
		String uuid, long groupId) {

		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the osi services trustee companyinfo where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching osi services trustee companyinfo, or <code>null</code> if a matching osi services trustee companyinfo could not be found
	 */
	@Override
	public OsiServicesTrusteeCompanyinfo fetchByUUID_G(
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

		if (result instanceof OsiServicesTrusteeCompanyinfo) {
			OsiServicesTrusteeCompanyinfo osiServicesTrusteeCompanyinfo =
				(OsiServicesTrusteeCompanyinfo)result;

			if (!Objects.equals(
					uuid, osiServicesTrusteeCompanyinfo.getUuid()) ||
				(groupId != osiServicesTrusteeCompanyinfo.getGroupId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_OSISERVICESTRUSTEECOMPANYINFO_WHERE);

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

				List<OsiServicesTrusteeCompanyinfo> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByUUID_G, finderArgs, list);
					}
				}
				else {
					OsiServicesTrusteeCompanyinfo
						osiServicesTrusteeCompanyinfo = list.get(0);

					result = osiServicesTrusteeCompanyinfo;

					cacheResult(osiServicesTrusteeCompanyinfo);
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
			return (OsiServicesTrusteeCompanyinfo)result;
		}
	}

	/**
	 * Removes the osi services trustee companyinfo where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the osi services trustee companyinfo that was removed
	 */
	@Override
	public OsiServicesTrusteeCompanyinfo removeByUUID_G(
			String uuid, long groupId)
		throws NoSuchOsiServicesTrusteeCompanyinfoException {

		OsiServicesTrusteeCompanyinfo osiServicesTrusteeCompanyinfo =
			findByUUID_G(uuid, groupId);

		return remove(osiServicesTrusteeCompanyinfo);
	}

	/**
	 * Returns the number of osi services trustee companyinfos where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching osi services trustee companyinfos
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUUID_G;

		Object[] finderArgs = new Object[] {uuid, groupId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_OSISERVICESTRUSTEECOMPANYINFO_WHERE);

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
		"osiServicesTrusteeCompanyinfo.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_G_UUID_3 =
		"(osiServicesTrusteeCompanyinfo.uuid IS NULL OR osiServicesTrusteeCompanyinfo.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 =
		"osiServicesTrusteeCompanyinfo.groupId = ?";

	private FinderPath _finderPathWithPaginationFindByUuid_C;
	private FinderPath _finderPathWithoutPaginationFindByUuid_C;
	private FinderPath _finderPathCountByUuid_C;

	/**
	 * Returns all the osi services trustee companyinfos where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching osi services trustee companyinfos
	 */
	@Override
	public List<OsiServicesTrusteeCompanyinfo> findByUuid_C(
		String uuid, long companyId) {

		return findByUuid_C(
			uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the osi services trustee companyinfos where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesTrusteeCompanyinfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of osi services trustee companyinfos
	 * @param end the upper bound of the range of osi services trustee companyinfos (not inclusive)
	 * @return the range of matching osi services trustee companyinfos
	 */
	@Override
	public List<OsiServicesTrusteeCompanyinfo> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return findByUuid_C(uuid, companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the osi services trustee companyinfos where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesTrusteeCompanyinfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of osi services trustee companyinfos
	 * @param end the upper bound of the range of osi services trustee companyinfos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching osi services trustee companyinfos
	 */
	@Override
	public List<OsiServicesTrusteeCompanyinfo> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<OsiServicesTrusteeCompanyinfo> orderByComparator) {

		return findByUuid_C(
			uuid, companyId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the osi services trustee companyinfos where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesTrusteeCompanyinfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of osi services trustee companyinfos
	 * @param end the upper bound of the range of osi services trustee companyinfos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching osi services trustee companyinfos
	 */
	@Override
	public List<OsiServicesTrusteeCompanyinfo> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<OsiServicesTrusteeCompanyinfo> orderByComparator,
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

		List<OsiServicesTrusteeCompanyinfo> list = null;

		if (useFinderCache) {
			list = (List<OsiServicesTrusteeCompanyinfo>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (OsiServicesTrusteeCompanyinfo
						osiServicesTrusteeCompanyinfo : list) {

					if (!uuid.equals(osiServicesTrusteeCompanyinfo.getUuid()) ||
						(companyId !=
							osiServicesTrusteeCompanyinfo.getCompanyId())) {

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

			sb.append(_SQL_SELECT_OSISERVICESTRUSTEECOMPANYINFO_WHERE);

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
				sb.append(OsiServicesTrusteeCompanyinfoModelImpl.ORDER_BY_JPQL);
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

				list = (List<OsiServicesTrusteeCompanyinfo>)QueryUtil.list(
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
	 * Returns the first osi services trustee companyinfo in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi services trustee companyinfo
	 * @throws NoSuchOsiServicesTrusteeCompanyinfoException if a matching osi services trustee companyinfo could not be found
	 */
	@Override
	public OsiServicesTrusteeCompanyinfo findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<OsiServicesTrusteeCompanyinfo> orderByComparator)
		throws NoSuchOsiServicesTrusteeCompanyinfoException {

		OsiServicesTrusteeCompanyinfo osiServicesTrusteeCompanyinfo =
			fetchByUuid_C_First(uuid, companyId, orderByComparator);

		if (osiServicesTrusteeCompanyinfo != null) {
			return osiServicesTrusteeCompanyinfo;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchOsiServicesTrusteeCompanyinfoException(sb.toString());
	}

	/**
	 * Returns the first osi services trustee companyinfo in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi services trustee companyinfo, or <code>null</code> if a matching osi services trustee companyinfo could not be found
	 */
	@Override
	public OsiServicesTrusteeCompanyinfo fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<OsiServicesTrusteeCompanyinfo> orderByComparator) {

		List<OsiServicesTrusteeCompanyinfo> list = findByUuid_C(
			uuid, companyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last osi services trustee companyinfo in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi services trustee companyinfo
	 * @throws NoSuchOsiServicesTrusteeCompanyinfoException if a matching osi services trustee companyinfo could not be found
	 */
	@Override
	public OsiServicesTrusteeCompanyinfo findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<OsiServicesTrusteeCompanyinfo> orderByComparator)
		throws NoSuchOsiServicesTrusteeCompanyinfoException {

		OsiServicesTrusteeCompanyinfo osiServicesTrusteeCompanyinfo =
			fetchByUuid_C_Last(uuid, companyId, orderByComparator);

		if (osiServicesTrusteeCompanyinfo != null) {
			return osiServicesTrusteeCompanyinfo;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchOsiServicesTrusteeCompanyinfoException(sb.toString());
	}

	/**
	 * Returns the last osi services trustee companyinfo in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi services trustee companyinfo, or <code>null</code> if a matching osi services trustee companyinfo could not be found
	 */
	@Override
	public OsiServicesTrusteeCompanyinfo fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<OsiServicesTrusteeCompanyinfo> orderByComparator) {

		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<OsiServicesTrusteeCompanyinfo> list = findByUuid_C(
			uuid, companyId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the osi services trustee companyinfos before and after the current osi services trustee companyinfo in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param osiTrusId the primary key of the current osi services trustee companyinfo
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next osi services trustee companyinfo
	 * @throws NoSuchOsiServicesTrusteeCompanyinfoException if a osi services trustee companyinfo with the primary key could not be found
	 */
	@Override
	public OsiServicesTrusteeCompanyinfo[] findByUuid_C_PrevAndNext(
			long osiTrusId, String uuid, long companyId,
			OrderByComparator<OsiServicesTrusteeCompanyinfo> orderByComparator)
		throws NoSuchOsiServicesTrusteeCompanyinfoException {

		uuid = Objects.toString(uuid, "");

		OsiServicesTrusteeCompanyinfo osiServicesTrusteeCompanyinfo =
			findByPrimaryKey(osiTrusId);

		Session session = null;

		try {
			session = openSession();

			OsiServicesTrusteeCompanyinfo[] array =
				new OsiServicesTrusteeCompanyinfoImpl[3];

			array[0] = getByUuid_C_PrevAndNext(
				session, osiServicesTrusteeCompanyinfo, uuid, companyId,
				orderByComparator, true);

			array[1] = osiServicesTrusteeCompanyinfo;

			array[2] = getByUuid_C_PrevAndNext(
				session, osiServicesTrusteeCompanyinfo, uuid, companyId,
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

	protected OsiServicesTrusteeCompanyinfo getByUuid_C_PrevAndNext(
		Session session,
		OsiServicesTrusteeCompanyinfo osiServicesTrusteeCompanyinfo,
		String uuid, long companyId,
		OrderByComparator<OsiServicesTrusteeCompanyinfo> orderByComparator,
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

		sb.append(_SQL_SELECT_OSISERVICESTRUSTEECOMPANYINFO_WHERE);

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
			sb.append(OsiServicesTrusteeCompanyinfoModelImpl.ORDER_BY_JPQL);
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
						osiServicesTrusteeCompanyinfo)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<OsiServicesTrusteeCompanyinfo> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the osi services trustee companyinfos where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (OsiServicesTrusteeCompanyinfo osiServicesTrusteeCompanyinfo :
				findByUuid_C(
					uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(osiServicesTrusteeCompanyinfo);
		}
	}

	/**
	 * Returns the number of osi services trustee companyinfos where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching osi services trustee companyinfos
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid_C;

		Object[] finderArgs = new Object[] {uuid, companyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_OSISERVICESTRUSTEECOMPANYINFO_WHERE);

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
		"osiServicesTrusteeCompanyinfo.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_C_UUID_3 =
		"(osiServicesTrusteeCompanyinfo.uuid IS NULL OR osiServicesTrusteeCompanyinfo.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 =
		"osiServicesTrusteeCompanyinfo.companyId = ?";

	private FinderPath _finderPathFetchBygetOsiServicesById;
	private FinderPath _finderPathCountBygetOsiServicesById;

	/**
	 * Returns the osi services trustee companyinfo where osiServicesApplicationId = &#63; or throws a <code>NoSuchOsiServicesTrusteeCompanyinfoException</code> if it could not be found.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @return the matching osi services trustee companyinfo
	 * @throws NoSuchOsiServicesTrusteeCompanyinfoException if a matching osi services trustee companyinfo could not be found
	 */
	@Override
	public OsiServicesTrusteeCompanyinfo findBygetOsiServicesById(
			long osiServicesApplicationId)
		throws NoSuchOsiServicesTrusteeCompanyinfoException {

		OsiServicesTrusteeCompanyinfo osiServicesTrusteeCompanyinfo =
			fetchBygetOsiServicesById(osiServicesApplicationId);

		if (osiServicesTrusteeCompanyinfo == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("osiServicesApplicationId=");
			sb.append(osiServicesApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchOsiServicesTrusteeCompanyinfoException(
				sb.toString());
		}

		return osiServicesTrusteeCompanyinfo;
	}

	/**
	 * Returns the osi services trustee companyinfo where osiServicesApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @return the matching osi services trustee companyinfo, or <code>null</code> if a matching osi services trustee companyinfo could not be found
	 */
	@Override
	public OsiServicesTrusteeCompanyinfo fetchBygetOsiServicesById(
		long osiServicesApplicationId) {

		return fetchBygetOsiServicesById(osiServicesApplicationId, true);
	}

	/**
	 * Returns the osi services trustee companyinfo where osiServicesApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching osi services trustee companyinfo, or <code>null</code> if a matching osi services trustee companyinfo could not be found
	 */
	@Override
	public OsiServicesTrusteeCompanyinfo fetchBygetOsiServicesById(
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

		if (result instanceof OsiServicesTrusteeCompanyinfo) {
			OsiServicesTrusteeCompanyinfo osiServicesTrusteeCompanyinfo =
				(OsiServicesTrusteeCompanyinfo)result;

			if (osiServicesApplicationId !=
					osiServicesTrusteeCompanyinfo.
						getOsiServicesApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_OSISERVICESTRUSTEECOMPANYINFO_WHERE);

			sb.append(
				_FINDER_COLUMN_GETOSISERVICESBYID_OSISERVICESAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(osiServicesApplicationId);

				List<OsiServicesTrusteeCompanyinfo> list = query.list();

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
								"OsiServicesTrusteeCompanyinfoPersistenceImpl.fetchBygetOsiServicesById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					OsiServicesTrusteeCompanyinfo
						osiServicesTrusteeCompanyinfo = list.get(0);

					result = osiServicesTrusteeCompanyinfo;

					cacheResult(osiServicesTrusteeCompanyinfo);
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
			return (OsiServicesTrusteeCompanyinfo)result;
		}
	}

	/**
	 * Removes the osi services trustee companyinfo where osiServicesApplicationId = &#63; from the database.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @return the osi services trustee companyinfo that was removed
	 */
	@Override
	public OsiServicesTrusteeCompanyinfo removeBygetOsiServicesById(
			long osiServicesApplicationId)
		throws NoSuchOsiServicesTrusteeCompanyinfoException {

		OsiServicesTrusteeCompanyinfo osiServicesTrusteeCompanyinfo =
			findBygetOsiServicesById(osiServicesApplicationId);

		return remove(osiServicesTrusteeCompanyinfo);
	}

	/**
	 * Returns the number of osi services trustee companyinfos where osiServicesApplicationId = &#63;.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @return the number of matching osi services trustee companyinfos
	 */
	@Override
	public int countBygetOsiServicesById(long osiServicesApplicationId) {
		FinderPath finderPath = _finderPathCountBygetOsiServicesById;

		Object[] finderArgs = new Object[] {osiServicesApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_OSISERVICESTRUSTEECOMPANYINFO_WHERE);

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
			"osiServicesTrusteeCompanyinfo.osiServicesApplicationId = ?";

	public OsiServicesTrusteeCompanyinfoPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");

		setDBColumnNames(dbColumnNames);

		setModelClass(OsiServicesTrusteeCompanyinfo.class);

		setModelImplClass(OsiServicesTrusteeCompanyinfoImpl.class);
		setModelPKClass(long.class);

		setTable(OsiServicesTrusteeCompanyinfoTable.INSTANCE);
	}

	/**
	 * Caches the osi services trustee companyinfo in the entity cache if it is enabled.
	 *
	 * @param osiServicesTrusteeCompanyinfo the osi services trustee companyinfo
	 */
	@Override
	public void cacheResult(
		OsiServicesTrusteeCompanyinfo osiServicesTrusteeCompanyinfo) {

		entityCache.putResult(
			OsiServicesTrusteeCompanyinfoImpl.class,
			osiServicesTrusteeCompanyinfo.getPrimaryKey(),
			osiServicesTrusteeCompanyinfo);

		finderCache.putResult(
			_finderPathFetchByUUID_G,
			new Object[] {
				osiServicesTrusteeCompanyinfo.getUuid(),
				osiServicesTrusteeCompanyinfo.getGroupId()
			},
			osiServicesTrusteeCompanyinfo);

		finderCache.putResult(
			_finderPathFetchBygetOsiServicesById,
			new Object[] {
				osiServicesTrusteeCompanyinfo.getOsiServicesApplicationId()
			},
			osiServicesTrusteeCompanyinfo);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the osi services trustee companyinfos in the entity cache if it is enabled.
	 *
	 * @param osiServicesTrusteeCompanyinfos the osi services trustee companyinfos
	 */
	@Override
	public void cacheResult(
		List<OsiServicesTrusteeCompanyinfo> osiServicesTrusteeCompanyinfos) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (osiServicesTrusteeCompanyinfos.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (OsiServicesTrusteeCompanyinfo osiServicesTrusteeCompanyinfo :
				osiServicesTrusteeCompanyinfos) {

			if (entityCache.getResult(
					OsiServicesTrusteeCompanyinfoImpl.class,
					osiServicesTrusteeCompanyinfo.getPrimaryKey()) == null) {

				cacheResult(osiServicesTrusteeCompanyinfo);
			}
		}
	}

	/**
	 * Clears the cache for all osi services trustee companyinfos.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(OsiServicesTrusteeCompanyinfoImpl.class);

		finderCache.clearCache(OsiServicesTrusteeCompanyinfoImpl.class);
	}

	/**
	 * Clears the cache for the osi services trustee companyinfo.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		OsiServicesTrusteeCompanyinfo osiServicesTrusteeCompanyinfo) {

		entityCache.removeResult(
			OsiServicesTrusteeCompanyinfoImpl.class,
			osiServicesTrusteeCompanyinfo);
	}

	@Override
	public void clearCache(
		List<OsiServicesTrusteeCompanyinfo> osiServicesTrusteeCompanyinfos) {

		for (OsiServicesTrusteeCompanyinfo osiServicesTrusteeCompanyinfo :
				osiServicesTrusteeCompanyinfos) {

			entityCache.removeResult(
				OsiServicesTrusteeCompanyinfoImpl.class,
				osiServicesTrusteeCompanyinfo);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(OsiServicesTrusteeCompanyinfoImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				OsiServicesTrusteeCompanyinfoImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		OsiServicesTrusteeCompanyinfoModelImpl
			osiServicesTrusteeCompanyinfoModelImpl) {

		Object[] args = new Object[] {
			osiServicesTrusteeCompanyinfoModelImpl.getUuid(),
			osiServicesTrusteeCompanyinfoModelImpl.getGroupId()
		};

		finderCache.putResult(_finderPathCountByUUID_G, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchByUUID_G, args,
			osiServicesTrusteeCompanyinfoModelImpl);

		args = new Object[] {
			osiServicesTrusteeCompanyinfoModelImpl.getOsiServicesApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetOsiServicesById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetOsiServicesById, args,
			osiServicesTrusteeCompanyinfoModelImpl);
	}

	/**
	 * Creates a new osi services trustee companyinfo with the primary key. Does not add the osi services trustee companyinfo to the database.
	 *
	 * @param osiTrusId the primary key for the new osi services trustee companyinfo
	 * @return the new osi services trustee companyinfo
	 */
	@Override
	public OsiServicesTrusteeCompanyinfo create(long osiTrusId) {
		OsiServicesTrusteeCompanyinfo osiServicesTrusteeCompanyinfo =
			new OsiServicesTrusteeCompanyinfoImpl();

		osiServicesTrusteeCompanyinfo.setNew(true);
		osiServicesTrusteeCompanyinfo.setPrimaryKey(osiTrusId);

		String uuid = PortalUUIDUtil.generate();

		osiServicesTrusteeCompanyinfo.setUuid(uuid);

		osiServicesTrusteeCompanyinfo.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return osiServicesTrusteeCompanyinfo;
	}

	/**
	 * Removes the osi services trustee companyinfo with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param osiTrusId the primary key of the osi services trustee companyinfo
	 * @return the osi services trustee companyinfo that was removed
	 * @throws NoSuchOsiServicesTrusteeCompanyinfoException if a osi services trustee companyinfo with the primary key could not be found
	 */
	@Override
	public OsiServicesTrusteeCompanyinfo remove(long osiTrusId)
		throws NoSuchOsiServicesTrusteeCompanyinfoException {

		return remove((Serializable)osiTrusId);
	}

	/**
	 * Removes the osi services trustee companyinfo with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the osi services trustee companyinfo
	 * @return the osi services trustee companyinfo that was removed
	 * @throws NoSuchOsiServicesTrusteeCompanyinfoException if a osi services trustee companyinfo with the primary key could not be found
	 */
	@Override
	public OsiServicesTrusteeCompanyinfo remove(Serializable primaryKey)
		throws NoSuchOsiServicesTrusteeCompanyinfoException {

		Session session = null;

		try {
			session = openSession();

			OsiServicesTrusteeCompanyinfo osiServicesTrusteeCompanyinfo =
				(OsiServicesTrusteeCompanyinfo)session.get(
					OsiServicesTrusteeCompanyinfoImpl.class, primaryKey);

			if (osiServicesTrusteeCompanyinfo == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchOsiServicesTrusteeCompanyinfoException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(osiServicesTrusteeCompanyinfo);
		}
		catch (NoSuchOsiServicesTrusteeCompanyinfoException
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
	protected OsiServicesTrusteeCompanyinfo removeImpl(
		OsiServicesTrusteeCompanyinfo osiServicesTrusteeCompanyinfo) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(osiServicesTrusteeCompanyinfo)) {
				osiServicesTrusteeCompanyinfo =
					(OsiServicesTrusteeCompanyinfo)session.get(
						OsiServicesTrusteeCompanyinfoImpl.class,
						osiServicesTrusteeCompanyinfo.getPrimaryKeyObj());
			}

			if (osiServicesTrusteeCompanyinfo != null) {
				session.delete(osiServicesTrusteeCompanyinfo);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (osiServicesTrusteeCompanyinfo != null) {
			clearCache(osiServicesTrusteeCompanyinfo);
		}

		return osiServicesTrusteeCompanyinfo;
	}

	@Override
	public OsiServicesTrusteeCompanyinfo updateImpl(
		OsiServicesTrusteeCompanyinfo osiServicesTrusteeCompanyinfo) {

		boolean isNew = osiServicesTrusteeCompanyinfo.isNew();

		if (!(osiServicesTrusteeCompanyinfo instanceof
				OsiServicesTrusteeCompanyinfoModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(
					osiServicesTrusteeCompanyinfo.getClass())) {

				invocationHandler = ProxyUtil.getInvocationHandler(
					osiServicesTrusteeCompanyinfo);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in osiServicesTrusteeCompanyinfo proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom OsiServicesTrusteeCompanyinfo implementation " +
					osiServicesTrusteeCompanyinfo.getClass());
		}

		OsiServicesTrusteeCompanyinfoModelImpl
			osiServicesTrusteeCompanyinfoModelImpl =
				(OsiServicesTrusteeCompanyinfoModelImpl)
					osiServicesTrusteeCompanyinfo;

		if (Validator.isNull(osiServicesTrusteeCompanyinfo.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			osiServicesTrusteeCompanyinfo.setUuid(uuid);
		}

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (osiServicesTrusteeCompanyinfo.getCreateDate() == null)) {
			if (serviceContext == null) {
				osiServicesTrusteeCompanyinfo.setCreateDate(date);
			}
			else {
				osiServicesTrusteeCompanyinfo.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!osiServicesTrusteeCompanyinfoModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				osiServicesTrusteeCompanyinfo.setModifiedDate(date);
			}
			else {
				osiServicesTrusteeCompanyinfo.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(osiServicesTrusteeCompanyinfo);
			}
			else {
				osiServicesTrusteeCompanyinfo =
					(OsiServicesTrusteeCompanyinfo)session.merge(
						osiServicesTrusteeCompanyinfo);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			OsiServicesTrusteeCompanyinfoImpl.class,
			osiServicesTrusteeCompanyinfoModelImpl, false, true);

		cacheUniqueFindersCache(osiServicesTrusteeCompanyinfoModelImpl);

		if (isNew) {
			osiServicesTrusteeCompanyinfo.setNew(false);
		}

		osiServicesTrusteeCompanyinfo.resetOriginalValues();

		return osiServicesTrusteeCompanyinfo;
	}

	/**
	 * Returns the osi services trustee companyinfo with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the osi services trustee companyinfo
	 * @return the osi services trustee companyinfo
	 * @throws NoSuchOsiServicesTrusteeCompanyinfoException if a osi services trustee companyinfo with the primary key could not be found
	 */
	@Override
	public OsiServicesTrusteeCompanyinfo findByPrimaryKey(
			Serializable primaryKey)
		throws NoSuchOsiServicesTrusteeCompanyinfoException {

		OsiServicesTrusteeCompanyinfo osiServicesTrusteeCompanyinfo =
			fetchByPrimaryKey(primaryKey);

		if (osiServicesTrusteeCompanyinfo == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchOsiServicesTrusteeCompanyinfoException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return osiServicesTrusteeCompanyinfo;
	}

	/**
	 * Returns the osi services trustee companyinfo with the primary key or throws a <code>NoSuchOsiServicesTrusteeCompanyinfoException</code> if it could not be found.
	 *
	 * @param osiTrusId the primary key of the osi services trustee companyinfo
	 * @return the osi services trustee companyinfo
	 * @throws NoSuchOsiServicesTrusteeCompanyinfoException if a osi services trustee companyinfo with the primary key could not be found
	 */
	@Override
	public OsiServicesTrusteeCompanyinfo findByPrimaryKey(long osiTrusId)
		throws NoSuchOsiServicesTrusteeCompanyinfoException {

		return findByPrimaryKey((Serializable)osiTrusId);
	}

	/**
	 * Returns the osi services trustee companyinfo with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param osiTrusId the primary key of the osi services trustee companyinfo
	 * @return the osi services trustee companyinfo, or <code>null</code> if a osi services trustee companyinfo with the primary key could not be found
	 */
	@Override
	public OsiServicesTrusteeCompanyinfo fetchByPrimaryKey(long osiTrusId) {
		return fetchByPrimaryKey((Serializable)osiTrusId);
	}

	/**
	 * Returns all the osi services trustee companyinfos.
	 *
	 * @return the osi services trustee companyinfos
	 */
	@Override
	public List<OsiServicesTrusteeCompanyinfo> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the osi services trustee companyinfos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesTrusteeCompanyinfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi services trustee companyinfos
	 * @param end the upper bound of the range of osi services trustee companyinfos (not inclusive)
	 * @return the range of osi services trustee companyinfos
	 */
	@Override
	public List<OsiServicesTrusteeCompanyinfo> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the osi services trustee companyinfos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesTrusteeCompanyinfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi services trustee companyinfos
	 * @param end the upper bound of the range of osi services trustee companyinfos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of osi services trustee companyinfos
	 */
	@Override
	public List<OsiServicesTrusteeCompanyinfo> findAll(
		int start, int end,
		OrderByComparator<OsiServicesTrusteeCompanyinfo> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the osi services trustee companyinfos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesTrusteeCompanyinfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi services trustee companyinfos
	 * @param end the upper bound of the range of osi services trustee companyinfos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of osi services trustee companyinfos
	 */
	@Override
	public List<OsiServicesTrusteeCompanyinfo> findAll(
		int start, int end,
		OrderByComparator<OsiServicesTrusteeCompanyinfo> orderByComparator,
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

		List<OsiServicesTrusteeCompanyinfo> list = null;

		if (useFinderCache) {
			list = (List<OsiServicesTrusteeCompanyinfo>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_OSISERVICESTRUSTEECOMPANYINFO);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_OSISERVICESTRUSTEECOMPANYINFO;

				sql = sql.concat(
					OsiServicesTrusteeCompanyinfoModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<OsiServicesTrusteeCompanyinfo>)QueryUtil.list(
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
	 * Removes all the osi services trustee companyinfos from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (OsiServicesTrusteeCompanyinfo osiServicesTrusteeCompanyinfo :
				findAll()) {

			remove(osiServicesTrusteeCompanyinfo);
		}
	}

	/**
	 * Returns the number of osi services trustee companyinfos.
	 *
	 * @return the number of osi services trustee companyinfos
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
					_SQL_COUNT_OSISERVICESTRUSTEECOMPANYINFO);

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
		return _SQL_SELECT_OSISERVICESTRUSTEECOMPANYINFO;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return OsiServicesTrusteeCompanyinfoModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the osi services trustee companyinfo persistence.
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

		OsiServicesTrusteeCompanyinfoUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		OsiServicesTrusteeCompanyinfoUtil.setPersistence(null);

		entityCache.removeCache(
			OsiServicesTrusteeCompanyinfoImpl.class.getName());
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

	private static final String _SQL_SELECT_OSISERVICESTRUSTEECOMPANYINFO =
		"SELECT osiServicesTrusteeCompanyinfo FROM OsiServicesTrusteeCompanyinfo osiServicesTrusteeCompanyinfo";

	private static final String
		_SQL_SELECT_OSISERVICESTRUSTEECOMPANYINFO_WHERE =
			"SELECT osiServicesTrusteeCompanyinfo FROM OsiServicesTrusteeCompanyinfo osiServicesTrusteeCompanyinfo WHERE ";

	private static final String _SQL_COUNT_OSISERVICESTRUSTEECOMPANYINFO =
		"SELECT COUNT(osiServicesTrusteeCompanyinfo) FROM OsiServicesTrusteeCompanyinfo osiServicesTrusteeCompanyinfo";

	private static final String _SQL_COUNT_OSISERVICESTRUSTEECOMPANYINFO_WHERE =
		"SELECT COUNT(osiServicesTrusteeCompanyinfo) FROM OsiServicesTrusteeCompanyinfo osiServicesTrusteeCompanyinfo WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"osiServicesTrusteeCompanyinfo.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No OsiServicesTrusteeCompanyinfo exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No OsiServicesTrusteeCompanyinfo exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		OsiServicesTrusteeCompanyinfoPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}