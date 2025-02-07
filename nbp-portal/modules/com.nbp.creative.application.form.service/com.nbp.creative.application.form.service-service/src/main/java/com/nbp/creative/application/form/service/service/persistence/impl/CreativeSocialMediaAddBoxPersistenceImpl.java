/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.creative.application.form.service.service.persistence.impl;

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

import com.nbp.creative.application.form.service.exception.NoSuchCreativeSocialMediaAddBoxException;
import com.nbp.creative.application.form.service.model.CreativeSocialMediaAddBox;
import com.nbp.creative.application.form.service.model.CreativeSocialMediaAddBoxTable;
import com.nbp.creative.application.form.service.model.impl.CreativeSocialMediaAddBoxImpl;
import com.nbp.creative.application.form.service.model.impl.CreativeSocialMediaAddBoxModelImpl;
import com.nbp.creative.application.form.service.service.persistence.CreativeSocialMediaAddBoxPersistence;
import com.nbp.creative.application.form.service.service.persistence.CreativeSocialMediaAddBoxUtil;
import com.nbp.creative.application.form.service.service.persistence.impl.constants.CREATIVEPersistenceConstants;

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
 * The persistence implementation for the creative social media add box service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = CreativeSocialMediaAddBoxPersistence.class)
public class CreativeSocialMediaAddBoxPersistenceImpl
	extends BasePersistenceImpl<CreativeSocialMediaAddBox>
	implements CreativeSocialMediaAddBoxPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>CreativeSocialMediaAddBoxUtil</code> to access the creative social media add box persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		CreativeSocialMediaAddBoxImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathWithPaginationFindBygetCA_CSB_CAI;
	private FinderPath _finderPathWithoutPaginationFindBygetCA_CSB_CAI;
	private FinderPath _finderPathCountBygetCA_CSB_CAI;

	/**
	 * Returns all the creative social media add boxes where CreativeApplicationId = &#63;.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @return the matching creative social media add boxes
	 */
	@Override
	public List<CreativeSocialMediaAddBox> findBygetCA_CSB_CAI(
		long CreativeApplicationId) {

		return findBygetCA_CSB_CAI(
			CreativeApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the creative social media add boxes where CreativeApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeSocialMediaAddBoxModelImpl</code>.
	 * </p>
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @param start the lower bound of the range of creative social media add boxes
	 * @param end the upper bound of the range of creative social media add boxes (not inclusive)
	 * @return the range of matching creative social media add boxes
	 */
	@Override
	public List<CreativeSocialMediaAddBox> findBygetCA_CSB_CAI(
		long CreativeApplicationId, int start, int end) {

		return findBygetCA_CSB_CAI(CreativeApplicationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the creative social media add boxes where CreativeApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeSocialMediaAddBoxModelImpl</code>.
	 * </p>
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @param start the lower bound of the range of creative social media add boxes
	 * @param end the upper bound of the range of creative social media add boxes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching creative social media add boxes
	 */
	@Override
	public List<CreativeSocialMediaAddBox> findBygetCA_CSB_CAI(
		long CreativeApplicationId, int start, int end,
		OrderByComparator<CreativeSocialMediaAddBox> orderByComparator) {

		return findBygetCA_CSB_CAI(
			CreativeApplicationId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the creative social media add boxes where CreativeApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeSocialMediaAddBoxModelImpl</code>.
	 * </p>
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @param start the lower bound of the range of creative social media add boxes
	 * @param end the upper bound of the range of creative social media add boxes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching creative social media add boxes
	 */
	@Override
	public List<CreativeSocialMediaAddBox> findBygetCA_CSB_CAI(
		long CreativeApplicationId, int start, int end,
		OrderByComparator<CreativeSocialMediaAddBox> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetCA_CSB_CAI;
				finderArgs = new Object[] {CreativeApplicationId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetCA_CSB_CAI;
			finderArgs = new Object[] {
				CreativeApplicationId, start, end, orderByComparator
			};
		}

		List<CreativeSocialMediaAddBox> list = null;

		if (useFinderCache) {
			list = (List<CreativeSocialMediaAddBox>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (CreativeSocialMediaAddBox creativeSocialMediaAddBox :
						list) {

					if (CreativeApplicationId !=
							creativeSocialMediaAddBox.
								getCreativeApplicationId()) {

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

			sb.append(_SQL_SELECT_CREATIVESOCIALMEDIAADDBOX_WHERE);

			sb.append(_FINDER_COLUMN_GETCA_CSB_CAI_CREATIVEAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(CreativeSocialMediaAddBoxModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(CreativeApplicationId);

				list = (List<CreativeSocialMediaAddBox>)QueryUtil.list(
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
	 * Returns the first creative social media add box in the ordered set where CreativeApplicationId = &#63;.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching creative social media add box
	 * @throws NoSuchCreativeSocialMediaAddBoxException if a matching creative social media add box could not be found
	 */
	@Override
	public CreativeSocialMediaAddBox findBygetCA_CSB_CAI_First(
			long CreativeApplicationId,
			OrderByComparator<CreativeSocialMediaAddBox> orderByComparator)
		throws NoSuchCreativeSocialMediaAddBoxException {

		CreativeSocialMediaAddBox creativeSocialMediaAddBox =
			fetchBygetCA_CSB_CAI_First(
				CreativeApplicationId, orderByComparator);

		if (creativeSocialMediaAddBox != null) {
			return creativeSocialMediaAddBox;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("CreativeApplicationId=");
		sb.append(CreativeApplicationId);

		sb.append("}");

		throw new NoSuchCreativeSocialMediaAddBoxException(sb.toString());
	}

	/**
	 * Returns the first creative social media add box in the ordered set where CreativeApplicationId = &#63;.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching creative social media add box, or <code>null</code> if a matching creative social media add box could not be found
	 */
	@Override
	public CreativeSocialMediaAddBox fetchBygetCA_CSB_CAI_First(
		long CreativeApplicationId,
		OrderByComparator<CreativeSocialMediaAddBox> orderByComparator) {

		List<CreativeSocialMediaAddBox> list = findBygetCA_CSB_CAI(
			CreativeApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last creative social media add box in the ordered set where CreativeApplicationId = &#63;.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching creative social media add box
	 * @throws NoSuchCreativeSocialMediaAddBoxException if a matching creative social media add box could not be found
	 */
	@Override
	public CreativeSocialMediaAddBox findBygetCA_CSB_CAI_Last(
			long CreativeApplicationId,
			OrderByComparator<CreativeSocialMediaAddBox> orderByComparator)
		throws NoSuchCreativeSocialMediaAddBoxException {

		CreativeSocialMediaAddBox creativeSocialMediaAddBox =
			fetchBygetCA_CSB_CAI_Last(CreativeApplicationId, orderByComparator);

		if (creativeSocialMediaAddBox != null) {
			return creativeSocialMediaAddBox;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("CreativeApplicationId=");
		sb.append(CreativeApplicationId);

		sb.append("}");

		throw new NoSuchCreativeSocialMediaAddBoxException(sb.toString());
	}

	/**
	 * Returns the last creative social media add box in the ordered set where CreativeApplicationId = &#63;.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching creative social media add box, or <code>null</code> if a matching creative social media add box could not be found
	 */
	@Override
	public CreativeSocialMediaAddBox fetchBygetCA_CSB_CAI_Last(
		long CreativeApplicationId,
		OrderByComparator<CreativeSocialMediaAddBox> orderByComparator) {

		int count = countBygetCA_CSB_CAI(CreativeApplicationId);

		if (count == 0) {
			return null;
		}

		List<CreativeSocialMediaAddBox> list = findBygetCA_CSB_CAI(
			CreativeApplicationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the creative social media add boxes before and after the current creative social media add box in the ordered set where CreativeApplicationId = &#63;.
	 *
	 * @param creativeSocialBoxId the primary key of the current creative social media add box
	 * @param CreativeApplicationId the creative application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next creative social media add box
	 * @throws NoSuchCreativeSocialMediaAddBoxException if a creative social media add box with the primary key could not be found
	 */
	@Override
	public CreativeSocialMediaAddBox[] findBygetCA_CSB_CAI_PrevAndNext(
			long creativeSocialBoxId, long CreativeApplicationId,
			OrderByComparator<CreativeSocialMediaAddBox> orderByComparator)
		throws NoSuchCreativeSocialMediaAddBoxException {

		CreativeSocialMediaAddBox creativeSocialMediaAddBox = findByPrimaryKey(
			creativeSocialBoxId);

		Session session = null;

		try {
			session = openSession();

			CreativeSocialMediaAddBox[] array =
				new CreativeSocialMediaAddBoxImpl[3];

			array[0] = getBygetCA_CSB_CAI_PrevAndNext(
				session, creativeSocialMediaAddBox, CreativeApplicationId,
				orderByComparator, true);

			array[1] = creativeSocialMediaAddBox;

			array[2] = getBygetCA_CSB_CAI_PrevAndNext(
				session, creativeSocialMediaAddBox, CreativeApplicationId,
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

	protected CreativeSocialMediaAddBox getBygetCA_CSB_CAI_PrevAndNext(
		Session session, CreativeSocialMediaAddBox creativeSocialMediaAddBox,
		long CreativeApplicationId,
		OrderByComparator<CreativeSocialMediaAddBox> orderByComparator,
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

		sb.append(_SQL_SELECT_CREATIVESOCIALMEDIAADDBOX_WHERE);

		sb.append(_FINDER_COLUMN_GETCA_CSB_CAI_CREATIVEAPPLICATIONID_2);

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
			sb.append(CreativeSocialMediaAddBoxModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(CreativeApplicationId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						creativeSocialMediaAddBox)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<CreativeSocialMediaAddBox> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the creative social media add boxes where CreativeApplicationId = &#63; from the database.
	 *
	 * @param CreativeApplicationId the creative application ID
	 */
	@Override
	public void removeBygetCA_CSB_CAI(long CreativeApplicationId) {
		for (CreativeSocialMediaAddBox creativeSocialMediaAddBox :
				findBygetCA_CSB_CAI(
					CreativeApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(creativeSocialMediaAddBox);
		}
	}

	/**
	 * Returns the number of creative social media add boxes where CreativeApplicationId = &#63;.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @return the number of matching creative social media add boxes
	 */
	@Override
	public int countBygetCA_CSB_CAI(long CreativeApplicationId) {
		FinderPath finderPath = _finderPathCountBygetCA_CSB_CAI;

		Object[] finderArgs = new Object[] {CreativeApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_CREATIVESOCIALMEDIAADDBOX_WHERE);

			sb.append(_FINDER_COLUMN_GETCA_CSB_CAI_CREATIVEAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(CreativeApplicationId);

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
		_FINDER_COLUMN_GETCA_CSB_CAI_CREATIVEAPPLICATIONID_2 =
			"creativeSocialMediaAddBox.CreativeApplicationId = ?";

	public CreativeSocialMediaAddBoxPersistenceImpl() {
		setModelClass(CreativeSocialMediaAddBox.class);

		setModelImplClass(CreativeSocialMediaAddBoxImpl.class);
		setModelPKClass(long.class);

		setTable(CreativeSocialMediaAddBoxTable.INSTANCE);
	}

	/**
	 * Caches the creative social media add box in the entity cache if it is enabled.
	 *
	 * @param creativeSocialMediaAddBox the creative social media add box
	 */
	@Override
	public void cacheResult(
		CreativeSocialMediaAddBox creativeSocialMediaAddBox) {

		entityCache.putResult(
			CreativeSocialMediaAddBoxImpl.class,
			creativeSocialMediaAddBox.getPrimaryKey(),
			creativeSocialMediaAddBox);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the creative social media add boxes in the entity cache if it is enabled.
	 *
	 * @param creativeSocialMediaAddBoxes the creative social media add boxes
	 */
	@Override
	public void cacheResult(
		List<CreativeSocialMediaAddBox> creativeSocialMediaAddBoxes) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (creativeSocialMediaAddBoxes.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (CreativeSocialMediaAddBox creativeSocialMediaAddBox :
				creativeSocialMediaAddBoxes) {

			if (entityCache.getResult(
					CreativeSocialMediaAddBoxImpl.class,
					creativeSocialMediaAddBox.getPrimaryKey()) == null) {

				cacheResult(creativeSocialMediaAddBox);
			}
		}
	}

	/**
	 * Clears the cache for all creative social media add boxes.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(CreativeSocialMediaAddBoxImpl.class);

		finderCache.clearCache(CreativeSocialMediaAddBoxImpl.class);
	}

	/**
	 * Clears the cache for the creative social media add box.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		CreativeSocialMediaAddBox creativeSocialMediaAddBox) {

		entityCache.removeResult(
			CreativeSocialMediaAddBoxImpl.class, creativeSocialMediaAddBox);
	}

	@Override
	public void clearCache(
		List<CreativeSocialMediaAddBox> creativeSocialMediaAddBoxes) {

		for (CreativeSocialMediaAddBox creativeSocialMediaAddBox :
				creativeSocialMediaAddBoxes) {

			entityCache.removeResult(
				CreativeSocialMediaAddBoxImpl.class, creativeSocialMediaAddBox);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(CreativeSocialMediaAddBoxImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				CreativeSocialMediaAddBoxImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new creative social media add box with the primary key. Does not add the creative social media add box to the database.
	 *
	 * @param creativeSocialBoxId the primary key for the new creative social media add box
	 * @return the new creative social media add box
	 */
	@Override
	public CreativeSocialMediaAddBox create(long creativeSocialBoxId) {
		CreativeSocialMediaAddBox creativeSocialMediaAddBox =
			new CreativeSocialMediaAddBoxImpl();

		creativeSocialMediaAddBox.setNew(true);
		creativeSocialMediaAddBox.setPrimaryKey(creativeSocialBoxId);

		creativeSocialMediaAddBox.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return creativeSocialMediaAddBox;
	}

	/**
	 * Removes the creative social media add box with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param creativeSocialBoxId the primary key of the creative social media add box
	 * @return the creative social media add box that was removed
	 * @throws NoSuchCreativeSocialMediaAddBoxException if a creative social media add box with the primary key could not be found
	 */
	@Override
	public CreativeSocialMediaAddBox remove(long creativeSocialBoxId)
		throws NoSuchCreativeSocialMediaAddBoxException {

		return remove((Serializable)creativeSocialBoxId);
	}

	/**
	 * Removes the creative social media add box with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the creative social media add box
	 * @return the creative social media add box that was removed
	 * @throws NoSuchCreativeSocialMediaAddBoxException if a creative social media add box with the primary key could not be found
	 */
	@Override
	public CreativeSocialMediaAddBox remove(Serializable primaryKey)
		throws NoSuchCreativeSocialMediaAddBoxException {

		Session session = null;

		try {
			session = openSession();

			CreativeSocialMediaAddBox creativeSocialMediaAddBox =
				(CreativeSocialMediaAddBox)session.get(
					CreativeSocialMediaAddBoxImpl.class, primaryKey);

			if (creativeSocialMediaAddBox == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchCreativeSocialMediaAddBoxException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(creativeSocialMediaAddBox);
		}
		catch (NoSuchCreativeSocialMediaAddBoxException noSuchEntityException) {
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
	protected CreativeSocialMediaAddBox removeImpl(
		CreativeSocialMediaAddBox creativeSocialMediaAddBox) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(creativeSocialMediaAddBox)) {
				creativeSocialMediaAddBox =
					(CreativeSocialMediaAddBox)session.get(
						CreativeSocialMediaAddBoxImpl.class,
						creativeSocialMediaAddBox.getPrimaryKeyObj());
			}

			if (creativeSocialMediaAddBox != null) {
				session.delete(creativeSocialMediaAddBox);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (creativeSocialMediaAddBox != null) {
			clearCache(creativeSocialMediaAddBox);
		}

		return creativeSocialMediaAddBox;
	}

	@Override
	public CreativeSocialMediaAddBox updateImpl(
		CreativeSocialMediaAddBox creativeSocialMediaAddBox) {

		boolean isNew = creativeSocialMediaAddBox.isNew();

		if (!(creativeSocialMediaAddBox instanceof
				CreativeSocialMediaAddBoxModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(creativeSocialMediaAddBox.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					creativeSocialMediaAddBox);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in creativeSocialMediaAddBox proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom CreativeSocialMediaAddBox implementation " +
					creativeSocialMediaAddBox.getClass());
		}

		CreativeSocialMediaAddBoxModelImpl creativeSocialMediaAddBoxModelImpl =
			(CreativeSocialMediaAddBoxModelImpl)creativeSocialMediaAddBox;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (creativeSocialMediaAddBox.getCreateDate() == null)) {
			if (serviceContext == null) {
				creativeSocialMediaAddBox.setCreateDate(date);
			}
			else {
				creativeSocialMediaAddBox.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!creativeSocialMediaAddBoxModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				creativeSocialMediaAddBox.setModifiedDate(date);
			}
			else {
				creativeSocialMediaAddBox.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(creativeSocialMediaAddBox);
			}
			else {
				creativeSocialMediaAddBox =
					(CreativeSocialMediaAddBox)session.merge(
						creativeSocialMediaAddBox);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			CreativeSocialMediaAddBoxImpl.class,
			creativeSocialMediaAddBoxModelImpl, false, true);

		if (isNew) {
			creativeSocialMediaAddBox.setNew(false);
		}

		creativeSocialMediaAddBox.resetOriginalValues();

		return creativeSocialMediaAddBox;
	}

	/**
	 * Returns the creative social media add box with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the creative social media add box
	 * @return the creative social media add box
	 * @throws NoSuchCreativeSocialMediaAddBoxException if a creative social media add box with the primary key could not be found
	 */
	@Override
	public CreativeSocialMediaAddBox findByPrimaryKey(Serializable primaryKey)
		throws NoSuchCreativeSocialMediaAddBoxException {

		CreativeSocialMediaAddBox creativeSocialMediaAddBox = fetchByPrimaryKey(
			primaryKey);

		if (creativeSocialMediaAddBox == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchCreativeSocialMediaAddBoxException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return creativeSocialMediaAddBox;
	}

	/**
	 * Returns the creative social media add box with the primary key or throws a <code>NoSuchCreativeSocialMediaAddBoxException</code> if it could not be found.
	 *
	 * @param creativeSocialBoxId the primary key of the creative social media add box
	 * @return the creative social media add box
	 * @throws NoSuchCreativeSocialMediaAddBoxException if a creative social media add box with the primary key could not be found
	 */
	@Override
	public CreativeSocialMediaAddBox findByPrimaryKey(long creativeSocialBoxId)
		throws NoSuchCreativeSocialMediaAddBoxException {

		return findByPrimaryKey((Serializable)creativeSocialBoxId);
	}

	/**
	 * Returns the creative social media add box with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param creativeSocialBoxId the primary key of the creative social media add box
	 * @return the creative social media add box, or <code>null</code> if a creative social media add box with the primary key could not be found
	 */
	@Override
	public CreativeSocialMediaAddBox fetchByPrimaryKey(
		long creativeSocialBoxId) {

		return fetchByPrimaryKey((Serializable)creativeSocialBoxId);
	}

	/**
	 * Returns all the creative social media add boxes.
	 *
	 * @return the creative social media add boxes
	 */
	@Override
	public List<CreativeSocialMediaAddBox> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the creative social media add boxes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeSocialMediaAddBoxModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of creative social media add boxes
	 * @param end the upper bound of the range of creative social media add boxes (not inclusive)
	 * @return the range of creative social media add boxes
	 */
	@Override
	public List<CreativeSocialMediaAddBox> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the creative social media add boxes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeSocialMediaAddBoxModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of creative social media add boxes
	 * @param end the upper bound of the range of creative social media add boxes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of creative social media add boxes
	 */
	@Override
	public List<CreativeSocialMediaAddBox> findAll(
		int start, int end,
		OrderByComparator<CreativeSocialMediaAddBox> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the creative social media add boxes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeSocialMediaAddBoxModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of creative social media add boxes
	 * @param end the upper bound of the range of creative social media add boxes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of creative social media add boxes
	 */
	@Override
	public List<CreativeSocialMediaAddBox> findAll(
		int start, int end,
		OrderByComparator<CreativeSocialMediaAddBox> orderByComparator,
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

		List<CreativeSocialMediaAddBox> list = null;

		if (useFinderCache) {
			list = (List<CreativeSocialMediaAddBox>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_CREATIVESOCIALMEDIAADDBOX);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_CREATIVESOCIALMEDIAADDBOX;

				sql = sql.concat(
					CreativeSocialMediaAddBoxModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<CreativeSocialMediaAddBox>)QueryUtil.list(
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
	 * Removes all the creative social media add boxes from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (CreativeSocialMediaAddBox creativeSocialMediaAddBox : findAll()) {
			remove(creativeSocialMediaAddBox);
		}
	}

	/**
	 * Returns the number of creative social media add boxes.
	 *
	 * @return the number of creative social media add boxes
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
					_SQL_COUNT_CREATIVESOCIALMEDIAADDBOX);

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
		return "creativeSocialBoxId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_CREATIVESOCIALMEDIAADDBOX;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return CreativeSocialMediaAddBoxModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the creative social media add box persistence.
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

		_finderPathWithPaginationFindBygetCA_CSB_CAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetCA_CSB_CAI",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"CreativeApplicationId"}, true);

		_finderPathWithoutPaginationFindBygetCA_CSB_CAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetCA_CSB_CAI",
			new String[] {Long.class.getName()},
			new String[] {"CreativeApplicationId"}, true);

		_finderPathCountBygetCA_CSB_CAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetCA_CSB_CAI",
			new String[] {Long.class.getName()},
			new String[] {"CreativeApplicationId"}, false);

		CreativeSocialMediaAddBoxUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		CreativeSocialMediaAddBoxUtil.setPersistence(null);

		entityCache.removeCache(CreativeSocialMediaAddBoxImpl.class.getName());
	}

	@Override
	@Reference(
		target = CREATIVEPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = CREATIVEPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = CREATIVEPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_CREATIVESOCIALMEDIAADDBOX =
		"SELECT creativeSocialMediaAddBox FROM CreativeSocialMediaAddBox creativeSocialMediaAddBox";

	private static final String _SQL_SELECT_CREATIVESOCIALMEDIAADDBOX_WHERE =
		"SELECT creativeSocialMediaAddBox FROM CreativeSocialMediaAddBox creativeSocialMediaAddBox WHERE ";

	private static final String _SQL_COUNT_CREATIVESOCIALMEDIAADDBOX =
		"SELECT COUNT(creativeSocialMediaAddBox) FROM CreativeSocialMediaAddBox creativeSocialMediaAddBox";

	private static final String _SQL_COUNT_CREATIVESOCIALMEDIAADDBOX_WHERE =
		"SELECT COUNT(creativeSocialMediaAddBox) FROM CreativeSocialMediaAddBox creativeSocialMediaAddBox WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"creativeSocialMediaAddBox.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No CreativeSocialMediaAddBox exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No CreativeSocialMediaAddBox exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		CreativeSocialMediaAddBoxPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}