/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service.persistence.impl;

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

import com.nbp.janaac.application.form.service.exception.NoSuchAddLabTestStructuralReqSecException;
import com.nbp.janaac.application.form.service.model.AddLabTestStructuralReqSec;
import com.nbp.janaac.application.form.service.model.AddLabTestStructuralReqSecTable;
import com.nbp.janaac.application.form.service.model.impl.AddLabTestStructuralReqSecImpl;
import com.nbp.janaac.application.form.service.model.impl.AddLabTestStructuralReqSecModelImpl;
import com.nbp.janaac.application.form.service.service.persistence.AddLabTestStructuralReqSecPersistence;
import com.nbp.janaac.application.form.service.service.persistence.AddLabTestStructuralReqSecUtil;
import com.nbp.janaac.application.form.service.service.persistence.impl.constants.JANAAC_APPLICATION_FORMPersistenceConstants;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * The persistence implementation for the add lab test structural req sec service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = AddLabTestStructuralReqSecPersistence.class)
public class AddLabTestStructuralReqSecPersistenceImpl
	extends BasePersistenceImpl<AddLabTestStructuralReqSec>
	implements AddLabTestStructuralReqSecPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>AddLabTestStructuralReqSecUtil</code> to access the add lab test structural req sec persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		AddLabTestStructuralReqSecImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathWithPaginationFindBygetJanaacById;
	private FinderPath _finderPathWithoutPaginationFindBygetJanaacById;
	private FinderPath _finderPathCountBygetJanaacById;

	/**
	 * Returns all the add lab test structural req secs where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the matching add lab test structural req secs
	 */
	@Override
	public List<AddLabTestStructuralReqSec> findBygetJanaacById(
		long janaacApplicationId) {

		return findBygetJanaacById(
			janaacApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the add lab test structural req secs where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddLabTestStructuralReqSecModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add lab test structural req secs
	 * @param end the upper bound of the range of add lab test structural req secs (not inclusive)
	 * @return the range of matching add lab test structural req secs
	 */
	@Override
	public List<AddLabTestStructuralReqSec> findBygetJanaacById(
		long janaacApplicationId, int start, int end) {

		return findBygetJanaacById(janaacApplicationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the add lab test structural req secs where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddLabTestStructuralReqSecModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add lab test structural req secs
	 * @param end the upper bound of the range of add lab test structural req secs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching add lab test structural req secs
	 */
	@Override
	public List<AddLabTestStructuralReqSec> findBygetJanaacById(
		long janaacApplicationId, int start, int end,
		OrderByComparator<AddLabTestStructuralReqSec> orderByComparator) {

		return findBygetJanaacById(
			janaacApplicationId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the add lab test structural req secs where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddLabTestStructuralReqSecModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add lab test structural req secs
	 * @param end the upper bound of the range of add lab test structural req secs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching add lab test structural req secs
	 */
	@Override
	public List<AddLabTestStructuralReqSec> findBygetJanaacById(
		long janaacApplicationId, int start, int end,
		OrderByComparator<AddLabTestStructuralReqSec> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetJanaacById;
				finderArgs = new Object[] {janaacApplicationId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetJanaacById;
			finderArgs = new Object[] {
				janaacApplicationId, start, end, orderByComparator
			};
		}

		List<AddLabTestStructuralReqSec> list = null;

		if (useFinderCache) {
			list = (List<AddLabTestStructuralReqSec>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (AddLabTestStructuralReqSec addLabTestStructuralReqSec :
						list) {

					if (janaacApplicationId !=
							addLabTestStructuralReqSec.
								getJanaacApplicationId()) {

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

			sb.append(_SQL_SELECT_ADDLABTESTSTRUCTURALREQSEC_WHERE);

			sb.append(_FINDER_COLUMN_GETJANAACBYID_JANAACAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(AddLabTestStructuralReqSecModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(janaacApplicationId);

				list = (List<AddLabTestStructuralReqSec>)QueryUtil.list(
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
	 * Returns the first add lab test structural req sec in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add lab test structural req sec
	 * @throws NoSuchAddLabTestStructuralReqSecException if a matching add lab test structural req sec could not be found
	 */
	@Override
	public AddLabTestStructuralReqSec findBygetJanaacById_First(
			long janaacApplicationId,
			OrderByComparator<AddLabTestStructuralReqSec> orderByComparator)
		throws NoSuchAddLabTestStructuralReqSecException {

		AddLabTestStructuralReqSec addLabTestStructuralReqSec =
			fetchBygetJanaacById_First(janaacApplicationId, orderByComparator);

		if (addLabTestStructuralReqSec != null) {
			return addLabTestStructuralReqSec;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("janaacApplicationId=");
		sb.append(janaacApplicationId);

		sb.append("}");

		throw new NoSuchAddLabTestStructuralReqSecException(sb.toString());
	}

	/**
	 * Returns the first add lab test structural req sec in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add lab test structural req sec, or <code>null</code> if a matching add lab test structural req sec could not be found
	 */
	@Override
	public AddLabTestStructuralReqSec fetchBygetJanaacById_First(
		long janaacApplicationId,
		OrderByComparator<AddLabTestStructuralReqSec> orderByComparator) {

		List<AddLabTestStructuralReqSec> list = findBygetJanaacById(
			janaacApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last add lab test structural req sec in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add lab test structural req sec
	 * @throws NoSuchAddLabTestStructuralReqSecException if a matching add lab test structural req sec could not be found
	 */
	@Override
	public AddLabTestStructuralReqSec findBygetJanaacById_Last(
			long janaacApplicationId,
			OrderByComparator<AddLabTestStructuralReqSec> orderByComparator)
		throws NoSuchAddLabTestStructuralReqSecException {

		AddLabTestStructuralReqSec addLabTestStructuralReqSec =
			fetchBygetJanaacById_Last(janaacApplicationId, orderByComparator);

		if (addLabTestStructuralReqSec != null) {
			return addLabTestStructuralReqSec;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("janaacApplicationId=");
		sb.append(janaacApplicationId);

		sb.append("}");

		throw new NoSuchAddLabTestStructuralReqSecException(sb.toString());
	}

	/**
	 * Returns the last add lab test structural req sec in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add lab test structural req sec, or <code>null</code> if a matching add lab test structural req sec could not be found
	 */
	@Override
	public AddLabTestStructuralReqSec fetchBygetJanaacById_Last(
		long janaacApplicationId,
		OrderByComparator<AddLabTestStructuralReqSec> orderByComparator) {

		int count = countBygetJanaacById(janaacApplicationId);

		if (count == 0) {
			return null;
		}

		List<AddLabTestStructuralReqSec> list = findBygetJanaacById(
			janaacApplicationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the add lab test structural req secs before and after the current add lab test structural req sec in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param addLabTestStructuralReqSecId the primary key of the current add lab test structural req sec
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next add lab test structural req sec
	 * @throws NoSuchAddLabTestStructuralReqSecException if a add lab test structural req sec with the primary key could not be found
	 */
	@Override
	public AddLabTestStructuralReqSec[] findBygetJanaacById_PrevAndNext(
			long addLabTestStructuralReqSecId, long janaacApplicationId,
			OrderByComparator<AddLabTestStructuralReqSec> orderByComparator)
		throws NoSuchAddLabTestStructuralReqSecException {

		AddLabTestStructuralReqSec addLabTestStructuralReqSec =
			findByPrimaryKey(addLabTestStructuralReqSecId);

		Session session = null;

		try {
			session = openSession();

			AddLabTestStructuralReqSec[] array =
				new AddLabTestStructuralReqSecImpl[3];

			array[0] = getBygetJanaacById_PrevAndNext(
				session, addLabTestStructuralReqSec, janaacApplicationId,
				orderByComparator, true);

			array[1] = addLabTestStructuralReqSec;

			array[2] = getBygetJanaacById_PrevAndNext(
				session, addLabTestStructuralReqSec, janaacApplicationId,
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

	protected AddLabTestStructuralReqSec getBygetJanaacById_PrevAndNext(
		Session session, AddLabTestStructuralReqSec addLabTestStructuralReqSec,
		long janaacApplicationId,
		OrderByComparator<AddLabTestStructuralReqSec> orderByComparator,
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

		sb.append(_SQL_SELECT_ADDLABTESTSTRUCTURALREQSEC_WHERE);

		sb.append(_FINDER_COLUMN_GETJANAACBYID_JANAACAPPLICATIONID_2);

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
			sb.append(AddLabTestStructuralReqSecModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(janaacApplicationId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						addLabTestStructuralReqSec)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<AddLabTestStructuralReqSec> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the add lab test structural req secs where janaacApplicationId = &#63; from the database.
	 *
	 * @param janaacApplicationId the janaac application ID
	 */
	@Override
	public void removeBygetJanaacById(long janaacApplicationId) {
		for (AddLabTestStructuralReqSec addLabTestStructuralReqSec :
				findBygetJanaacById(
					janaacApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(addLabTestStructuralReqSec);
		}
	}

	/**
	 * Returns the number of add lab test structural req secs where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the number of matching add lab test structural req secs
	 */
	@Override
	public int countBygetJanaacById(long janaacApplicationId) {
		FinderPath finderPath = _finderPathCountBygetJanaacById;

		Object[] finderArgs = new Object[] {janaacApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_ADDLABTESTSTRUCTURALREQSEC_WHERE);

			sb.append(_FINDER_COLUMN_GETJANAACBYID_JANAACAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(janaacApplicationId);

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
		_FINDER_COLUMN_GETJANAACBYID_JANAACAPPLICATIONID_2 =
			"addLabTestStructuralReqSec.janaacApplicationId = ?";

	public AddLabTestStructuralReqSecPersistenceImpl() {
		setModelClass(AddLabTestStructuralReqSec.class);

		setModelImplClass(AddLabTestStructuralReqSecImpl.class);
		setModelPKClass(long.class);

		setTable(AddLabTestStructuralReqSecTable.INSTANCE);
	}

	/**
	 * Caches the add lab test structural req sec in the entity cache if it is enabled.
	 *
	 * @param addLabTestStructuralReqSec the add lab test structural req sec
	 */
	@Override
	public void cacheResult(
		AddLabTestStructuralReqSec addLabTestStructuralReqSec) {

		entityCache.putResult(
			AddLabTestStructuralReqSecImpl.class,
			addLabTestStructuralReqSec.getPrimaryKey(),
			addLabTestStructuralReqSec);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the add lab test structural req secs in the entity cache if it is enabled.
	 *
	 * @param addLabTestStructuralReqSecs the add lab test structural req secs
	 */
	@Override
	public void cacheResult(
		List<AddLabTestStructuralReqSec> addLabTestStructuralReqSecs) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (addLabTestStructuralReqSecs.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (AddLabTestStructuralReqSec addLabTestStructuralReqSec :
				addLabTestStructuralReqSecs) {

			if (entityCache.getResult(
					AddLabTestStructuralReqSecImpl.class,
					addLabTestStructuralReqSec.getPrimaryKey()) == null) {

				cacheResult(addLabTestStructuralReqSec);
			}
		}
	}

	/**
	 * Clears the cache for all add lab test structural req secs.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(AddLabTestStructuralReqSecImpl.class);

		finderCache.clearCache(AddLabTestStructuralReqSecImpl.class);
	}

	/**
	 * Clears the cache for the add lab test structural req sec.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		AddLabTestStructuralReqSec addLabTestStructuralReqSec) {

		entityCache.removeResult(
			AddLabTestStructuralReqSecImpl.class, addLabTestStructuralReqSec);
	}

	@Override
	public void clearCache(
		List<AddLabTestStructuralReqSec> addLabTestStructuralReqSecs) {

		for (AddLabTestStructuralReqSec addLabTestStructuralReqSec :
				addLabTestStructuralReqSecs) {

			entityCache.removeResult(
				AddLabTestStructuralReqSecImpl.class,
				addLabTestStructuralReqSec);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(AddLabTestStructuralReqSecImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				AddLabTestStructuralReqSecImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new add lab test structural req sec with the primary key. Does not add the add lab test structural req sec to the database.
	 *
	 * @param addLabTestStructuralReqSecId the primary key for the new add lab test structural req sec
	 * @return the new add lab test structural req sec
	 */
	@Override
	public AddLabTestStructuralReqSec create(
		long addLabTestStructuralReqSecId) {

		AddLabTestStructuralReqSec addLabTestStructuralReqSec =
			new AddLabTestStructuralReqSecImpl();

		addLabTestStructuralReqSec.setNew(true);
		addLabTestStructuralReqSec.setPrimaryKey(addLabTestStructuralReqSecId);

		addLabTestStructuralReqSec.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return addLabTestStructuralReqSec;
	}

	/**
	 * Removes the add lab test structural req sec with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param addLabTestStructuralReqSecId the primary key of the add lab test structural req sec
	 * @return the add lab test structural req sec that was removed
	 * @throws NoSuchAddLabTestStructuralReqSecException if a add lab test structural req sec with the primary key could not be found
	 */
	@Override
	public AddLabTestStructuralReqSec remove(long addLabTestStructuralReqSecId)
		throws NoSuchAddLabTestStructuralReqSecException {

		return remove((Serializable)addLabTestStructuralReqSecId);
	}

	/**
	 * Removes the add lab test structural req sec with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the add lab test structural req sec
	 * @return the add lab test structural req sec that was removed
	 * @throws NoSuchAddLabTestStructuralReqSecException if a add lab test structural req sec with the primary key could not be found
	 */
	@Override
	public AddLabTestStructuralReqSec remove(Serializable primaryKey)
		throws NoSuchAddLabTestStructuralReqSecException {

		Session session = null;

		try {
			session = openSession();

			AddLabTestStructuralReqSec addLabTestStructuralReqSec =
				(AddLabTestStructuralReqSec)session.get(
					AddLabTestStructuralReqSecImpl.class, primaryKey);

			if (addLabTestStructuralReqSec == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchAddLabTestStructuralReqSecException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(addLabTestStructuralReqSec);
		}
		catch (NoSuchAddLabTestStructuralReqSecException
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
	protected AddLabTestStructuralReqSec removeImpl(
		AddLabTestStructuralReqSec addLabTestStructuralReqSec) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(addLabTestStructuralReqSec)) {
				addLabTestStructuralReqSec =
					(AddLabTestStructuralReqSec)session.get(
						AddLabTestStructuralReqSecImpl.class,
						addLabTestStructuralReqSec.getPrimaryKeyObj());
			}

			if (addLabTestStructuralReqSec != null) {
				session.delete(addLabTestStructuralReqSec);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (addLabTestStructuralReqSec != null) {
			clearCache(addLabTestStructuralReqSec);
		}

		return addLabTestStructuralReqSec;
	}

	@Override
	public AddLabTestStructuralReqSec updateImpl(
		AddLabTestStructuralReqSec addLabTestStructuralReqSec) {

		boolean isNew = addLabTestStructuralReqSec.isNew();

		if (!(addLabTestStructuralReqSec instanceof
				AddLabTestStructuralReqSecModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(addLabTestStructuralReqSec.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					addLabTestStructuralReqSec);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in addLabTestStructuralReqSec proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom AddLabTestStructuralReqSec implementation " +
					addLabTestStructuralReqSec.getClass());
		}

		AddLabTestStructuralReqSecModelImpl
			addLabTestStructuralReqSecModelImpl =
				(AddLabTestStructuralReqSecModelImpl)addLabTestStructuralReqSec;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (addLabTestStructuralReqSec.getCreateDate() == null)) {
			if (serviceContext == null) {
				addLabTestStructuralReqSec.setCreateDate(date);
			}
			else {
				addLabTestStructuralReqSec.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!addLabTestStructuralReqSecModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				addLabTestStructuralReqSec.setModifiedDate(date);
			}
			else {
				addLabTestStructuralReqSec.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(addLabTestStructuralReqSec);
			}
			else {
				addLabTestStructuralReqSec =
					(AddLabTestStructuralReqSec)session.merge(
						addLabTestStructuralReqSec);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			AddLabTestStructuralReqSecImpl.class,
			addLabTestStructuralReqSecModelImpl, false, true);

		if (isNew) {
			addLabTestStructuralReqSec.setNew(false);
		}

		addLabTestStructuralReqSec.resetOriginalValues();

		return addLabTestStructuralReqSec;
	}

	/**
	 * Returns the add lab test structural req sec with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the add lab test structural req sec
	 * @return the add lab test structural req sec
	 * @throws NoSuchAddLabTestStructuralReqSecException if a add lab test structural req sec with the primary key could not be found
	 */
	@Override
	public AddLabTestStructuralReqSec findByPrimaryKey(Serializable primaryKey)
		throws NoSuchAddLabTestStructuralReqSecException {

		AddLabTestStructuralReqSec addLabTestStructuralReqSec =
			fetchByPrimaryKey(primaryKey);

		if (addLabTestStructuralReqSec == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchAddLabTestStructuralReqSecException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return addLabTestStructuralReqSec;
	}

	/**
	 * Returns the add lab test structural req sec with the primary key or throws a <code>NoSuchAddLabTestStructuralReqSecException</code> if it could not be found.
	 *
	 * @param addLabTestStructuralReqSecId the primary key of the add lab test structural req sec
	 * @return the add lab test structural req sec
	 * @throws NoSuchAddLabTestStructuralReqSecException if a add lab test structural req sec with the primary key could not be found
	 */
	@Override
	public AddLabTestStructuralReqSec findByPrimaryKey(
			long addLabTestStructuralReqSecId)
		throws NoSuchAddLabTestStructuralReqSecException {

		return findByPrimaryKey((Serializable)addLabTestStructuralReqSecId);
	}

	/**
	 * Returns the add lab test structural req sec with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param addLabTestStructuralReqSecId the primary key of the add lab test structural req sec
	 * @return the add lab test structural req sec, or <code>null</code> if a add lab test structural req sec with the primary key could not be found
	 */
	@Override
	public AddLabTestStructuralReqSec fetchByPrimaryKey(
		long addLabTestStructuralReqSecId) {

		return fetchByPrimaryKey((Serializable)addLabTestStructuralReqSecId);
	}

	/**
	 * Returns all the add lab test structural req secs.
	 *
	 * @return the add lab test structural req secs
	 */
	@Override
	public List<AddLabTestStructuralReqSec> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the add lab test structural req secs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddLabTestStructuralReqSecModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add lab test structural req secs
	 * @param end the upper bound of the range of add lab test structural req secs (not inclusive)
	 * @return the range of add lab test structural req secs
	 */
	@Override
	public List<AddLabTestStructuralReqSec> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the add lab test structural req secs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddLabTestStructuralReqSecModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add lab test structural req secs
	 * @param end the upper bound of the range of add lab test structural req secs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of add lab test structural req secs
	 */
	@Override
	public List<AddLabTestStructuralReqSec> findAll(
		int start, int end,
		OrderByComparator<AddLabTestStructuralReqSec> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the add lab test structural req secs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddLabTestStructuralReqSecModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add lab test structural req secs
	 * @param end the upper bound of the range of add lab test structural req secs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of add lab test structural req secs
	 */
	@Override
	public List<AddLabTestStructuralReqSec> findAll(
		int start, int end,
		OrderByComparator<AddLabTestStructuralReqSec> orderByComparator,
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

		List<AddLabTestStructuralReqSec> list = null;

		if (useFinderCache) {
			list = (List<AddLabTestStructuralReqSec>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_ADDLABTESTSTRUCTURALREQSEC);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_ADDLABTESTSTRUCTURALREQSEC;

				sql = sql.concat(
					AddLabTestStructuralReqSecModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<AddLabTestStructuralReqSec>)QueryUtil.list(
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
	 * Removes all the add lab test structural req secs from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (AddLabTestStructuralReqSec addLabTestStructuralReqSec :
				findAll()) {

			remove(addLabTestStructuralReqSec);
		}
	}

	/**
	 * Returns the number of add lab test structural req secs.
	 *
	 * @return the number of add lab test structural req secs
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
					_SQL_COUNT_ADDLABTESTSTRUCTURALREQSEC);

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
	protected EntityCache getEntityCache() {
		return entityCache;
	}

	@Override
	protected String getPKDBName() {
		return "addLabTestStructuralReqSecId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_ADDLABTESTSTRUCTURALREQSEC;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return AddLabTestStructuralReqSecModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the add lab test structural req sec persistence.
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

		_finderPathWithPaginationFindBygetJanaacById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetJanaacById",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"janaacApplicationId"}, true);

		_finderPathWithoutPaginationFindBygetJanaacById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetJanaacById",
			new String[] {Long.class.getName()},
			new String[] {"janaacApplicationId"}, true);

		_finderPathCountBygetJanaacById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetJanaacById",
			new String[] {Long.class.getName()},
			new String[] {"janaacApplicationId"}, false);

		AddLabTestStructuralReqSecUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		AddLabTestStructuralReqSecUtil.setPersistence(null);

		entityCache.removeCache(AddLabTestStructuralReqSecImpl.class.getName());
	}

	@Override
	@Reference(
		target = JANAAC_APPLICATION_FORMPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = JANAAC_APPLICATION_FORMPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = JANAAC_APPLICATION_FORMPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_ADDLABTESTSTRUCTURALREQSEC =
		"SELECT addLabTestStructuralReqSec FROM AddLabTestStructuralReqSec addLabTestStructuralReqSec";

	private static final String _SQL_SELECT_ADDLABTESTSTRUCTURALREQSEC_WHERE =
		"SELECT addLabTestStructuralReqSec FROM AddLabTestStructuralReqSec addLabTestStructuralReqSec WHERE ";

	private static final String _SQL_COUNT_ADDLABTESTSTRUCTURALREQSEC =
		"SELECT COUNT(addLabTestStructuralReqSec) FROM AddLabTestStructuralReqSec addLabTestStructuralReqSec";

	private static final String _SQL_COUNT_ADDLABTESTSTRUCTURALREQSEC_WHERE =
		"SELECT COUNT(addLabTestStructuralReqSec) FROM AddLabTestStructuralReqSec addLabTestStructuralReqSec WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"addLabTestStructuralReqSec.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No AddLabTestStructuralReqSec exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No AddLabTestStructuralReqSec exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		AddLabTestStructuralReqSecPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}