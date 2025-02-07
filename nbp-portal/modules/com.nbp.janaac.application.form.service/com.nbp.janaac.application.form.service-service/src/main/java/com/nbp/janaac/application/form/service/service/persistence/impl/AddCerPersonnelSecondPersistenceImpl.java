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
import com.liferay.portal.kernel.util.SetUtil;

import com.nbp.janaac.application.form.service.exception.NoSuchAddCerPersonnelSecondException;
import com.nbp.janaac.application.form.service.model.AddCerPersonnelSecond;
import com.nbp.janaac.application.form.service.model.AddCerPersonnelSecondTable;
import com.nbp.janaac.application.form.service.model.impl.AddCerPersonnelSecondImpl;
import com.nbp.janaac.application.form.service.model.impl.AddCerPersonnelSecondModelImpl;
import com.nbp.janaac.application.form.service.service.persistence.AddCerPersonnelSecondPersistence;
import com.nbp.janaac.application.form.service.service.persistence.AddCerPersonnelSecondUtil;
import com.nbp.janaac.application.form.service.service.persistence.impl.constants.JANAAC_APPLICATION_FORMPersistenceConstants;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * The persistence implementation for the add cer personnel second service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = AddCerPersonnelSecondPersistence.class)
public class AddCerPersonnelSecondPersistenceImpl
	extends BasePersistenceImpl<AddCerPersonnelSecond>
	implements AddCerPersonnelSecondPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>AddCerPersonnelSecondUtil</code> to access the add cer personnel second persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		AddCerPersonnelSecondImpl.class.getName();

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
	 * Returns all the add cer personnel seconds where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the matching add cer personnel seconds
	 */
	@Override
	public List<AddCerPersonnelSecond> findBygetJanaacById(
		long janaacApplicationId) {

		return findBygetJanaacById(
			janaacApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the add cer personnel seconds where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddCerPersonnelSecondModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add cer personnel seconds
	 * @param end the upper bound of the range of add cer personnel seconds (not inclusive)
	 * @return the range of matching add cer personnel seconds
	 */
	@Override
	public List<AddCerPersonnelSecond> findBygetJanaacById(
		long janaacApplicationId, int start, int end) {

		return findBygetJanaacById(janaacApplicationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the add cer personnel seconds where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddCerPersonnelSecondModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add cer personnel seconds
	 * @param end the upper bound of the range of add cer personnel seconds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching add cer personnel seconds
	 */
	@Override
	public List<AddCerPersonnelSecond> findBygetJanaacById(
		long janaacApplicationId, int start, int end,
		OrderByComparator<AddCerPersonnelSecond> orderByComparator) {

		return findBygetJanaacById(
			janaacApplicationId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the add cer personnel seconds where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddCerPersonnelSecondModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add cer personnel seconds
	 * @param end the upper bound of the range of add cer personnel seconds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching add cer personnel seconds
	 */
	@Override
	public List<AddCerPersonnelSecond> findBygetJanaacById(
		long janaacApplicationId, int start, int end,
		OrderByComparator<AddCerPersonnelSecond> orderByComparator,
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

		List<AddCerPersonnelSecond> list = null;

		if (useFinderCache) {
			list = (List<AddCerPersonnelSecond>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (AddCerPersonnelSecond addCerPersonnelSecond : list) {
					if (janaacApplicationId !=
							addCerPersonnelSecond.getJanaacApplicationId()) {

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

			sb.append(_SQL_SELECT_ADDCERPERSONNELSECOND_WHERE);

			sb.append(_FINDER_COLUMN_GETJANAACBYID_JANAACAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(AddCerPersonnelSecondModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(janaacApplicationId);

				list = (List<AddCerPersonnelSecond>)QueryUtil.list(
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
	 * Returns the first add cer personnel second in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add cer personnel second
	 * @throws NoSuchAddCerPersonnelSecondException if a matching add cer personnel second could not be found
	 */
	@Override
	public AddCerPersonnelSecond findBygetJanaacById_First(
			long janaacApplicationId,
			OrderByComparator<AddCerPersonnelSecond> orderByComparator)
		throws NoSuchAddCerPersonnelSecondException {

		AddCerPersonnelSecond addCerPersonnelSecond =
			fetchBygetJanaacById_First(janaacApplicationId, orderByComparator);

		if (addCerPersonnelSecond != null) {
			return addCerPersonnelSecond;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("janaacApplicationId=");
		sb.append(janaacApplicationId);

		sb.append("}");

		throw new NoSuchAddCerPersonnelSecondException(sb.toString());
	}

	/**
	 * Returns the first add cer personnel second in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add cer personnel second, or <code>null</code> if a matching add cer personnel second could not be found
	 */
	@Override
	public AddCerPersonnelSecond fetchBygetJanaacById_First(
		long janaacApplicationId,
		OrderByComparator<AddCerPersonnelSecond> orderByComparator) {

		List<AddCerPersonnelSecond> list = findBygetJanaacById(
			janaacApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last add cer personnel second in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add cer personnel second
	 * @throws NoSuchAddCerPersonnelSecondException if a matching add cer personnel second could not be found
	 */
	@Override
	public AddCerPersonnelSecond findBygetJanaacById_Last(
			long janaacApplicationId,
			OrderByComparator<AddCerPersonnelSecond> orderByComparator)
		throws NoSuchAddCerPersonnelSecondException {

		AddCerPersonnelSecond addCerPersonnelSecond = fetchBygetJanaacById_Last(
			janaacApplicationId, orderByComparator);

		if (addCerPersonnelSecond != null) {
			return addCerPersonnelSecond;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("janaacApplicationId=");
		sb.append(janaacApplicationId);

		sb.append("}");

		throw new NoSuchAddCerPersonnelSecondException(sb.toString());
	}

	/**
	 * Returns the last add cer personnel second in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add cer personnel second, or <code>null</code> if a matching add cer personnel second could not be found
	 */
	@Override
	public AddCerPersonnelSecond fetchBygetJanaacById_Last(
		long janaacApplicationId,
		OrderByComparator<AddCerPersonnelSecond> orderByComparator) {

		int count = countBygetJanaacById(janaacApplicationId);

		if (count == 0) {
			return null;
		}

		List<AddCerPersonnelSecond> list = findBygetJanaacById(
			janaacApplicationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the add cer personnel seconds before and after the current add cer personnel second in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param addCerPersonnelSecondId the primary key of the current add cer personnel second
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next add cer personnel second
	 * @throws NoSuchAddCerPersonnelSecondException if a add cer personnel second with the primary key could not be found
	 */
	@Override
	public AddCerPersonnelSecond[] findBygetJanaacById_PrevAndNext(
			long addCerPersonnelSecondId, long janaacApplicationId,
			OrderByComparator<AddCerPersonnelSecond> orderByComparator)
		throws NoSuchAddCerPersonnelSecondException {

		AddCerPersonnelSecond addCerPersonnelSecond = findByPrimaryKey(
			addCerPersonnelSecondId);

		Session session = null;

		try {
			session = openSession();

			AddCerPersonnelSecond[] array = new AddCerPersonnelSecondImpl[3];

			array[0] = getBygetJanaacById_PrevAndNext(
				session, addCerPersonnelSecond, janaacApplicationId,
				orderByComparator, true);

			array[1] = addCerPersonnelSecond;

			array[2] = getBygetJanaacById_PrevAndNext(
				session, addCerPersonnelSecond, janaacApplicationId,
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

	protected AddCerPersonnelSecond getBygetJanaacById_PrevAndNext(
		Session session, AddCerPersonnelSecond addCerPersonnelSecond,
		long janaacApplicationId,
		OrderByComparator<AddCerPersonnelSecond> orderByComparator,
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

		sb.append(_SQL_SELECT_ADDCERPERSONNELSECOND_WHERE);

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
			sb.append(AddCerPersonnelSecondModelImpl.ORDER_BY_JPQL);
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
						addCerPersonnelSecond)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<AddCerPersonnelSecond> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the add cer personnel seconds where janaacApplicationId = &#63; from the database.
	 *
	 * @param janaacApplicationId the janaac application ID
	 */
	@Override
	public void removeBygetJanaacById(long janaacApplicationId) {
		for (AddCerPersonnelSecond addCerPersonnelSecond :
				findBygetJanaacById(
					janaacApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(addCerPersonnelSecond);
		}
	}

	/**
	 * Returns the number of add cer personnel seconds where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the number of matching add cer personnel seconds
	 */
	@Override
	public int countBygetJanaacById(long janaacApplicationId) {
		FinderPath finderPath = _finderPathCountBygetJanaacById;

		Object[] finderArgs = new Object[] {janaacApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_ADDCERPERSONNELSECOND_WHERE);

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
			"addCerPersonnelSecond.janaacApplicationId = ?";

	public AddCerPersonnelSecondPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("role", "role_");

		setDBColumnNames(dbColumnNames);

		setModelClass(AddCerPersonnelSecond.class);

		setModelImplClass(AddCerPersonnelSecondImpl.class);
		setModelPKClass(long.class);

		setTable(AddCerPersonnelSecondTable.INSTANCE);
	}

	/**
	 * Caches the add cer personnel second in the entity cache if it is enabled.
	 *
	 * @param addCerPersonnelSecond the add cer personnel second
	 */
	@Override
	public void cacheResult(AddCerPersonnelSecond addCerPersonnelSecond) {
		entityCache.putResult(
			AddCerPersonnelSecondImpl.class,
			addCerPersonnelSecond.getPrimaryKey(), addCerPersonnelSecond);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the add cer personnel seconds in the entity cache if it is enabled.
	 *
	 * @param addCerPersonnelSeconds the add cer personnel seconds
	 */
	@Override
	public void cacheResult(
		List<AddCerPersonnelSecond> addCerPersonnelSeconds) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (addCerPersonnelSeconds.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (AddCerPersonnelSecond addCerPersonnelSecond :
				addCerPersonnelSeconds) {

			if (entityCache.getResult(
					AddCerPersonnelSecondImpl.class,
					addCerPersonnelSecond.getPrimaryKey()) == null) {

				cacheResult(addCerPersonnelSecond);
			}
		}
	}

	/**
	 * Clears the cache for all add cer personnel seconds.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(AddCerPersonnelSecondImpl.class);

		finderCache.clearCache(AddCerPersonnelSecondImpl.class);
	}

	/**
	 * Clears the cache for the add cer personnel second.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(AddCerPersonnelSecond addCerPersonnelSecond) {
		entityCache.removeResult(
			AddCerPersonnelSecondImpl.class, addCerPersonnelSecond);
	}

	@Override
	public void clearCache(List<AddCerPersonnelSecond> addCerPersonnelSeconds) {
		for (AddCerPersonnelSecond addCerPersonnelSecond :
				addCerPersonnelSeconds) {

			entityCache.removeResult(
				AddCerPersonnelSecondImpl.class, addCerPersonnelSecond);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(AddCerPersonnelSecondImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				AddCerPersonnelSecondImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new add cer personnel second with the primary key. Does not add the add cer personnel second to the database.
	 *
	 * @param addCerPersonnelSecondId the primary key for the new add cer personnel second
	 * @return the new add cer personnel second
	 */
	@Override
	public AddCerPersonnelSecond create(long addCerPersonnelSecondId) {
		AddCerPersonnelSecond addCerPersonnelSecond =
			new AddCerPersonnelSecondImpl();

		addCerPersonnelSecond.setNew(true);
		addCerPersonnelSecond.setPrimaryKey(addCerPersonnelSecondId);

		addCerPersonnelSecond.setCompanyId(CompanyThreadLocal.getCompanyId());

		return addCerPersonnelSecond;
	}

	/**
	 * Removes the add cer personnel second with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param addCerPersonnelSecondId the primary key of the add cer personnel second
	 * @return the add cer personnel second that was removed
	 * @throws NoSuchAddCerPersonnelSecondException if a add cer personnel second with the primary key could not be found
	 */
	@Override
	public AddCerPersonnelSecond remove(long addCerPersonnelSecondId)
		throws NoSuchAddCerPersonnelSecondException {

		return remove((Serializable)addCerPersonnelSecondId);
	}

	/**
	 * Removes the add cer personnel second with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the add cer personnel second
	 * @return the add cer personnel second that was removed
	 * @throws NoSuchAddCerPersonnelSecondException if a add cer personnel second with the primary key could not be found
	 */
	@Override
	public AddCerPersonnelSecond remove(Serializable primaryKey)
		throws NoSuchAddCerPersonnelSecondException {

		Session session = null;

		try {
			session = openSession();

			AddCerPersonnelSecond addCerPersonnelSecond =
				(AddCerPersonnelSecond)session.get(
					AddCerPersonnelSecondImpl.class, primaryKey);

			if (addCerPersonnelSecond == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchAddCerPersonnelSecondException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(addCerPersonnelSecond);
		}
		catch (NoSuchAddCerPersonnelSecondException noSuchEntityException) {
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
	protected AddCerPersonnelSecond removeImpl(
		AddCerPersonnelSecond addCerPersonnelSecond) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(addCerPersonnelSecond)) {
				addCerPersonnelSecond = (AddCerPersonnelSecond)session.get(
					AddCerPersonnelSecondImpl.class,
					addCerPersonnelSecond.getPrimaryKeyObj());
			}

			if (addCerPersonnelSecond != null) {
				session.delete(addCerPersonnelSecond);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (addCerPersonnelSecond != null) {
			clearCache(addCerPersonnelSecond);
		}

		return addCerPersonnelSecond;
	}

	@Override
	public AddCerPersonnelSecond updateImpl(
		AddCerPersonnelSecond addCerPersonnelSecond) {

		boolean isNew = addCerPersonnelSecond.isNew();

		if (!(addCerPersonnelSecond instanceof
				AddCerPersonnelSecondModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(addCerPersonnelSecond.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					addCerPersonnelSecond);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in addCerPersonnelSecond proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom AddCerPersonnelSecond implementation " +
					addCerPersonnelSecond.getClass());
		}

		AddCerPersonnelSecondModelImpl addCerPersonnelSecondModelImpl =
			(AddCerPersonnelSecondModelImpl)addCerPersonnelSecond;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (addCerPersonnelSecond.getCreateDate() == null)) {
			if (serviceContext == null) {
				addCerPersonnelSecond.setCreateDate(date);
			}
			else {
				addCerPersonnelSecond.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!addCerPersonnelSecondModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				addCerPersonnelSecond.setModifiedDate(date);
			}
			else {
				addCerPersonnelSecond.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(addCerPersonnelSecond);
			}
			else {
				addCerPersonnelSecond = (AddCerPersonnelSecond)session.merge(
					addCerPersonnelSecond);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			AddCerPersonnelSecondImpl.class, addCerPersonnelSecondModelImpl,
			false, true);

		if (isNew) {
			addCerPersonnelSecond.setNew(false);
		}

		addCerPersonnelSecond.resetOriginalValues();

		return addCerPersonnelSecond;
	}

	/**
	 * Returns the add cer personnel second with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the add cer personnel second
	 * @return the add cer personnel second
	 * @throws NoSuchAddCerPersonnelSecondException if a add cer personnel second with the primary key could not be found
	 */
	@Override
	public AddCerPersonnelSecond findByPrimaryKey(Serializable primaryKey)
		throws NoSuchAddCerPersonnelSecondException {

		AddCerPersonnelSecond addCerPersonnelSecond = fetchByPrimaryKey(
			primaryKey);

		if (addCerPersonnelSecond == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchAddCerPersonnelSecondException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return addCerPersonnelSecond;
	}

	/**
	 * Returns the add cer personnel second with the primary key or throws a <code>NoSuchAddCerPersonnelSecondException</code> if it could not be found.
	 *
	 * @param addCerPersonnelSecondId the primary key of the add cer personnel second
	 * @return the add cer personnel second
	 * @throws NoSuchAddCerPersonnelSecondException if a add cer personnel second with the primary key could not be found
	 */
	@Override
	public AddCerPersonnelSecond findByPrimaryKey(long addCerPersonnelSecondId)
		throws NoSuchAddCerPersonnelSecondException {

		return findByPrimaryKey((Serializable)addCerPersonnelSecondId);
	}

	/**
	 * Returns the add cer personnel second with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param addCerPersonnelSecondId the primary key of the add cer personnel second
	 * @return the add cer personnel second, or <code>null</code> if a add cer personnel second with the primary key could not be found
	 */
	@Override
	public AddCerPersonnelSecond fetchByPrimaryKey(
		long addCerPersonnelSecondId) {

		return fetchByPrimaryKey((Serializable)addCerPersonnelSecondId);
	}

	/**
	 * Returns all the add cer personnel seconds.
	 *
	 * @return the add cer personnel seconds
	 */
	@Override
	public List<AddCerPersonnelSecond> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the add cer personnel seconds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddCerPersonnelSecondModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add cer personnel seconds
	 * @param end the upper bound of the range of add cer personnel seconds (not inclusive)
	 * @return the range of add cer personnel seconds
	 */
	@Override
	public List<AddCerPersonnelSecond> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the add cer personnel seconds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddCerPersonnelSecondModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add cer personnel seconds
	 * @param end the upper bound of the range of add cer personnel seconds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of add cer personnel seconds
	 */
	@Override
	public List<AddCerPersonnelSecond> findAll(
		int start, int end,
		OrderByComparator<AddCerPersonnelSecond> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the add cer personnel seconds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddCerPersonnelSecondModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add cer personnel seconds
	 * @param end the upper bound of the range of add cer personnel seconds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of add cer personnel seconds
	 */
	@Override
	public List<AddCerPersonnelSecond> findAll(
		int start, int end,
		OrderByComparator<AddCerPersonnelSecond> orderByComparator,
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

		List<AddCerPersonnelSecond> list = null;

		if (useFinderCache) {
			list = (List<AddCerPersonnelSecond>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_ADDCERPERSONNELSECOND);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_ADDCERPERSONNELSECOND;

				sql = sql.concat(AddCerPersonnelSecondModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<AddCerPersonnelSecond>)QueryUtil.list(
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
	 * Removes all the add cer personnel seconds from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (AddCerPersonnelSecond addCerPersonnelSecond : findAll()) {
			remove(addCerPersonnelSecond);
		}
	}

	/**
	 * Returns the number of add cer personnel seconds.
	 *
	 * @return the number of add cer personnel seconds
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
					_SQL_COUNT_ADDCERPERSONNELSECOND);

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
		return "addCerPersonnelSecondId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_ADDCERPERSONNELSECOND;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return AddCerPersonnelSecondModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the add cer personnel second persistence.
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

		AddCerPersonnelSecondUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		AddCerPersonnelSecondUtil.setPersistence(null);

		entityCache.removeCache(AddCerPersonnelSecondImpl.class.getName());
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

	private static final String _SQL_SELECT_ADDCERPERSONNELSECOND =
		"SELECT addCerPersonnelSecond FROM AddCerPersonnelSecond addCerPersonnelSecond";

	private static final String _SQL_SELECT_ADDCERPERSONNELSECOND_WHERE =
		"SELECT addCerPersonnelSecond FROM AddCerPersonnelSecond addCerPersonnelSecond WHERE ";

	private static final String _SQL_COUNT_ADDCERPERSONNELSECOND =
		"SELECT COUNT(addCerPersonnelSecond) FROM AddCerPersonnelSecond addCerPersonnelSecond";

	private static final String _SQL_COUNT_ADDCERPERSONNELSECOND_WHERE =
		"SELECT COUNT(addCerPersonnelSecond) FROM AddCerPersonnelSecond addCerPersonnelSecond WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"addCerPersonnelSecond.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No AddCerPersonnelSecond exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No AddCerPersonnelSecond exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		AddCerPersonnelSecondPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"role"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}